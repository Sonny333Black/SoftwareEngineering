package Zettel9;

/**
 * Created by Sonny on 15.01.2017.
 */
public class Main {

    public static void main(String args[]){
        MyCountry land = new MyCountryBuilder("Deutschland","deutsch").buildCountry();
        land.getResult();
        land = new MyCountryBuilder("Spanien","spanisch","Europa").buildCountry();
        land.getResult();
    }
}
