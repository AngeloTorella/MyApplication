package com.example.myapplication.models;

public class ApiRespuesta {

    private String Symbol;
    private Double MarketCapitalization;

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public Double getCurrency() {
        return MarketCapitalization;
    }

    public void setCurrency(Double currency) {
        MarketCapitalization = currency;
    }
}
