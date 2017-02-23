package Zettel9;

import java.util.Date;

public class Country{
        private String countryName;
        private String countryShortName;
        private String continent;
        private String currencyName;
        private String currencyShortName;
        private float exchangeRateToEuro;
        private Date exchangeRateDate;
        private String language;

        public Country(String countryName,String countryShortName,String continent,
        String currencyName,String currencyShortName,float exchangeRateToEuro,
        Date exchangeRateDate,String language){
        this.countryName=countryName;
        this.countryShortName=countryShortName;
        this.continent=continent;
        this.currencyName=currencyName;
        this.currencyShortName=currencyShortName;
        this.exchangeRateToEuro=exchangeRateToEuro;
        this.exchangeRateDate=exchangeRateDate;
        this.language=language;
        }
        public String getLanguage(){
        return language;
        }
        public float getExchangeRateToEuro(){
        return exchangeRateToEuro;
        }
        public Date getExchangeRateDate(){
        return exchangeRateDate;
        }
        public String getCurrencyShortName(){
        return currencyShortName;
        }
        public String getCountryName(){
        return countryName;
        }
        public String getCountryShortName(){
        return countryShortName;
        }
        public String getCurrencyName(){
        return currencyName;
        }
        public String getContinent(){
        return continent;
        }
        }