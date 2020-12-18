package homework1215;

import java.io.*;

public class IoExer {

    public static void main(String[] argjs) throws IOException {

        File f = new File("E:\\testR.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("dfs");
        fw.write("\nfdsdfsdf\n");
        fw.write(103);
        fw.flush();
        fw.close();

        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

    }


}
