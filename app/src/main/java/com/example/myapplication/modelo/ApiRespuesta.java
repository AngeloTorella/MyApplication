package com.example.myapplication.modelo;

public class ApiRespuesta {

    private char Type;
    private String Symbol;
    private Double MarketCapitalization;

    private String link(String link1, String symbol, String link2){
        return link1+symbol+link2;
    }
    private String searchCrypto(String symbol){
        return null;
    }

    private String searchForex(String symbol){
        return null;
    }

    private String searchInvest(String symbol){
        //funcionParaBuscar("query?function=OVERVIEW&symbol="+symbol+"&apikey=ZQBM92LGRBP4Q3F0")
        return null;
    }

    public String filtroBuscar(char type, String symbol){
        String nonull = null;

        if(type == 'C')
            nonull = searchCrypto(symbol);
        else if (type == 'F')
            nonull = searchForex(symbol);
        else if (type == 'I')
            nonull = searchInvest(symbol);

        if (nonull == null)
            return "Search not found";
        else return nonull;
    }

    public char getType() {
        return Type;
    }

    public void setType(char type) {
        Type = type;
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

}
