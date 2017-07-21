package dao;

/**
 * Created by aibar on 7/20/2017.
 */
public class Country {
    private String name;
    private int number;

    public Country(){

    }
    public Country(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
