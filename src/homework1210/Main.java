package homework1210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        boolean response = true;

        while (response) {
            String userInput = getUserInput("Enter the transaction detail:\n");
            String[] input = userInput.split(",");
            try {
                String result = processInput(input[0], Double.parseDouble(input[1]), input[2]);
                if (result.equals("Invalid data")) {
                    System.out.println(result);
                }
                else {
                    System.out.println("Total reward points earned in this transaction is " + result);
                }
            } catch (RuntimeException ex) { //java.lang.NumberFormatException, java.lang.ArrayIndexOutOfBoundsException
                System.out.println("Illegal transaction detail, please try again.");
                continue;
            }

            boolean responseLegit = false;
            while (!responseLegit) {
                String userDecision = getUserInput("Do you want to continue?(Yes/No):\n");
                if (userDecision.equals("Yes")) {
                    responseLegit = true;
                    continue;
                }
                if (userDecision.equals("No")) {
                    responseLegit = true;
                    response = false;
                    continue;
                }
                System.out.println("Illegal response, please try again.");
            }
        }
    }

    public static String processInput(String type, double amount, String cardType) {

        if (!cardType.equals("VISA card") && !cardType.equals("HPVISA card")) {
            return "Invalid data";
        }

        if (cardType.equals("VISA card")) {
            VISACard visaCard = new VISACard();
            return String.format("%.2f", visaCard.computeRewardPoints(type, amount));
        }
        else {
            HPVISACard hpvisaCard = new HPVISACard();
            return String.format("%.2f", hpvisaCard.computeRewardPoints(type, amount));
        }

    }

    public static String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt);
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0 ) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}

class VISACard {

    public double computeRewardPoints(String type, double amount) {
        return amount * 0.01;
    }

}

class HPVISACard extends VISACard {

    @Override
    public double computeRewardPoints(String type, double amount) {

        double base = super.computeRewardPoints(type, amount);
        if (type.equals("Fuel")) {
            return base + 10.00;
        }
        else {
            return base;
        }
    }
}

