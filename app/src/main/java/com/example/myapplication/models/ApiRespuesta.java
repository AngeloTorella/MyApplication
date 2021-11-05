package com.example.myapplication.models;

public class ApiRespuesta {

    private String Symbol;
    private Double MarketCapitalization;

    private void filtroBuscar(String ticketname){

    }

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

    public void filtroBuscar(String ticketname){
        char type = ticketname.ChartAt(0);
        ticketname = ticketname.deleteCharAt(0);
        if(type == "C")
        else if (type == "F")
            else if (type )
    }
}
