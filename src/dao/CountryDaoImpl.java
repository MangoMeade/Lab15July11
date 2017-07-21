package dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aibar on 7/20/2017.
 */
public class CountryDaoImpl implements CountryDao{

    List<Country> countryList = new ArrayList<>();

    public CountryDaoImpl(Country country) {

    }

    @Override
    public List<Country> getAllCountries() {
        return countryList;
    }

    @Override
    public Country getCountry(int number) {
        return countryList.get(number);
    }

    @Override
    public void addCountry(Country country) {
        countryList.add(new Country(country.getName(), country.getNumber()));
        System.out.println("Country: Num " + country.getNumber()
                +", updated in the database");
    }

    @Override
    public void removeCountry(Country country) {
        countryList.remove(new Country(country.getName(), country.getNumber()));
        System.out.println("Country: Roll No " + country.getNumber()
                +", deleted from database");
    }
}
