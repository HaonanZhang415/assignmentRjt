package homework1215;

import java.io.*;

public class Main0 {

    public static void main(String[] args) {

        File f = new File("./app.txt");
        try {
            f.createNewFile();
            PrintWriter pw = new PrintWriter(f);
            pw.write("Hello Tarry, Sorry Tarry, I am running late. Please try to find an alternative for today. Tarry, I will reach the office only till 3 pm. Kindly excuse my absence for the first half.");
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileReader fr = null;
        try {
            fr = new FileReader("./app.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);

        String line = "";
        try {
            line = br.readLine();
            while (br.readLine() != null) {
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);

        String[] words = line.split(" ");
        int result = 0;
        for (String word : words) {
            if (word.equals("Tarry") || word.equals("Tarry,") || word.equals("Tarry.")) {
                result++;
            }
        }
        System.out.println(result);


        Employee e = new Employee();
        System.out.println(e.calculateTax(150000));

    }

}

class Employee {

    double tax = 0.0;

    double calculateTax(double income) {

        if (income > 150000.0) {
            tax = tax + (income - 150000.0) * 0.3;
            income = 150000.0;
        }

        if (income > 60000.0) {
            tax = tax + (income - 60000.0) * 0.2;
            income = 60000.0;
        }

        if (income > 50000.0) {
            tax = tax + (income - 50000.0) * 0.1;
            income = 50000.0;
        }

        return tax;

    }

}