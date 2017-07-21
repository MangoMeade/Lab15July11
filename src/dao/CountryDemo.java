package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static dao.Validator.getString;

/**
 * Created by aibar on 7/20/2017.
 */
public class CountryDemo {
    public static void main(String[] args) {
        runProgram();


    }

    private static void runProgram() {
        Scanner scnr = new Scanner(System.in);
        String loop = "y";
        int counter = 1;

        Country country = new Country();
        CountryDao countryDao = new CountryDaoImpl(country);
        CountriesTextFile writeCountry = new CountriesTextFile();

        while (loop.equalsIgnoreCase("y")) {

            country.setName(getString(scnr, "Which country do you want to add to the list?"));
            country.setNumber(counter);
            counter += 1;

            countryDao.addCountry(new Country(country.getName(), country.getNumber()));
            writeCountry.writeToFile(countryDao);
            loop = getString(scnr, "Another country?");
        }
        writeCountry.readFromFile();
    }
}
