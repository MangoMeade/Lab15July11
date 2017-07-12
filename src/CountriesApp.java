import java.util.Scanner;

/**
 * Created by aibar on 7/11/2017.
 */
//App reads and writes to a text file
public class CountriesApp extends CountriesTextFile{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int chooseMenu = 0;
        String userInput = " ";

        System.out.println("Welcome to the Countries Maintenance Application!");


        while (chooseMenu != 3) {
            System.out.println("1. See the list of countries");
            System.out.println("2. Add a country");
            System.out.println("3. Exit");
            System.out.println();
            System.out.println("Enter menu number: ");
            chooseMenu = scnr.nextInt();
            switch (chooseMenu) {
                case 1:
                    readFromFile();
                    break;
                case 2:
                    System.out.println("Enter country: ");
                    userInput = scnr.next();
                    writeToFile(userInput);
                    System.out.println("This country has been saved!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Buh-bye!");
                    break;
            }
        }
    }
}
