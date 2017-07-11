import java.io.*;

/**
 * Created by aibar on 7/11/2017.
 */
public class CountriesTextFile {


    public static void readFromFile() {
        //read from file
        try {
            File myFile = new File("countries.txt");
            //file reader is a connection stream for characters that connects to a text file
            FileReader reader = new FileReader(myFile);

            //BufferedReader allows the FileReader to chain to it
            //it only goes back to check the file once the buffer is empty
            BufferedReader buff = new BufferedReader(reader);

            //declare a String variable to hold each line as it's read from the file
            String line = null;

            //this while loop says -- read a line of text and then assign it to the string line
            //while that variable is not null keep printing lines
            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
            buff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String userInput) {
        //write to file
        try {
            //if the file test.txt doesn't exist FileWriter will create it
            FileWriter writer = new FileWriter("countries.txt", true);
            writer.write(userInput + "\n");
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
