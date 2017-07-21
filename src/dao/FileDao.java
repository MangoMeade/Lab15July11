package dao;

import java.io.*;
import java.util.List;

/**
 * Created by aibar on 7/11/2017.
 */
//Class reads and writes to a text file
public class FileDao implements CountryDao{

    @Override
    public List<Country> getAllCountries() {
        return null;
    }

    @Override
    public Country getCountry(int number) {
        return null;
    }

    @Override
    public void addCountry(Country country) {

    }

    @Override
    public void removeCountry(Country country) {

    }

    @Override
    public void read() {
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

    @Override
    public  void write(CountryDao countryDao) {

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
    @Override
    public  void write(Country country) {

        try {
            FileWriter writer = new FileWriter("countries.txt", true);
            writer.write(country.getNumber() + " " + country.getName() + "\n");
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
