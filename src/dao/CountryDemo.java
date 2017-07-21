package dao;

import java.util.Scanner;
import static dao.Validator.getString;

/**
 * Created by aibar on 7/20/2017.
 */
//Program is run in this class
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
        CountryDao dao = DaoFactory.getDaoInstance(CountryDao.FILE_DAO);


        while (loop.equalsIgnoreCase("y")) {

            country.setName(getString(scnr, "Which country do you want to add to the list?"));
            country.setNumber(counter);
            counter += 1;

            countryDao.addCountry(new Country(country.getName(), country.getNumber()));
            dao.write(countryDao);
            loop = getString(scnr, "Another country?");
        }
        dao.read();
    }
}
