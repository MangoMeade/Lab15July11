package dao;

import java.util.List;

/**
 * Created by aibar on 7/20/2017.
 */
public interface CountryDao {
    public int FILE_DAO = 1;
    public int JDBC_DAO = 2;

    public List<Country> getAllCountries();
    public Country getCountry(int number);
    public void addCountry(Country country);
    public void removeCountry(Country country);
    public void read();
    public void write(Country country);
    public void write(CountryDao countryDao);



}
