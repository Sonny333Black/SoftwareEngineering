package Zettel9;

import java.util.Date;

/**
 * Created by Sonny on 15.01.2017.
 */
public class MyCountryBuilder {
    private String countryName;
    private String countryShortName;
    private String continent;
    private String currencyName;
    private String currencyShortName;
    private float exchangeRateToEuro;
    private Date exchangeRateDate;
    private String language;

    public MyCountry buildCountry(){ return new MyCountry(this);}

    public MyCountryBuilder(String countryName,String language){
        this.countryName = countryName;
        this.language = language;
    }
    public MyCountryBuilder(String countryName,String language,String continent){
        this.countryName = countryName;
        this.language = language;
        this.continent = continent;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryShortName() {
        return countryShortName;
    }

    public String getContinent() {
        return continent;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCurrencyShortName() {
        return currencyShortName;
    }

    public float getExchangeRateToEuro() {
        return exchangeRateToEuro;
    }

    public Date getExchangeRateDate() {
        return exchangeRateDate;
    }

    public String getLanguage() {
        return language;
    }

}
