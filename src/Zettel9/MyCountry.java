package Zettel9;

import java.util.Date;

/**
 * Created by Sonny on 15.01.2017.
 */
public class MyCountry {
    private String countryName;
    private String countryShortName;
    private String continent;
    private String currencyName;
    private String currencyShortName;
    private float exchangeRateToEuro;
    private Date exchangeRateDate;
    private String language;


    public void getResult(){
        System.out.println("\nLandname: "+countryName);
        System.out.println("\nSprache: "+language);
        System.out.println("\nKontinent: "+continent);
    }

    public MyCountry(String countryName,String language){
        this.countryName = countryName;
        this.language = language;
    }
    public MyCountry(String countryName,String language,String continent){
        this.countryName = countryName;
        this.language = language;
        this.continent = continent;
    }

    public MyCountry(MyCountryBuilder myCountryBuilder){
        this(myCountryBuilder.getCountryName(),myCountryBuilder.getLanguage(),
        myCountryBuilder.getContinent());
    }

}
