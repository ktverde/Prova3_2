package br.com.compasso.models;

public class Forecast
{
    private String date;
    private int max;
    private int min;

    @Override
    public String toString() {
        return  "<br>-------------------------- <br>" +
                "   Data da previsao: " + date +
                "   <br> Maxima: " + max +
                "   <br> Minima: " + min;
    }
}
