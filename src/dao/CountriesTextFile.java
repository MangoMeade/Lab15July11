package dao;

import java.io.*;

/**
 * Created by aibar on 7/11/2017.
 */
//Class reads and writes to a text file
public class CountriesTextFile {


    public void readFromFile() {
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

    public  void writeToFile(CountryDao countryDao) {

        try {
            FileWriter writer = new FileWriter("countries.txt", false);
            for ( Country countryInList : countryDao.getAllCountries()){
                writer.write(countryInList.getNumber() + " " + countryInList.getName() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  void writeToFile(Country country) {

        try {
            FileWriter writer = new FileWriter("countries.txt", true);
            writer.write(country.getNumber() + " " + country.getName() + "\n");
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
