import java.io.*;

/**
 * Created by aibar on 7/11/2017.
 */
//Class reads and writes to a text file
public class CountriesTextFile {


    public static void readFromFile() {
        try {
            File myFile = new File("countries.txt");
            FileReader reader = new FileReader(myFile);

            BufferedReader buff = new BufferedReader(reader);


            String line = null;

            while ((line = buff.readLine()) != null) {
                if (line.equalsIgnoreCase("Peru")) {
                    line.trim();
                }
                System.out.println(line);
            }
            System.out.println();
            buff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String userInput) {
        try {
            FileWriter writer = new FileWriter("countries.txt", true);
            writer.write(userInput + "\n");
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
