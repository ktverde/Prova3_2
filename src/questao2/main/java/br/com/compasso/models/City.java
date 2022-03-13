package br.com.compasso.models;

import java.util.List;

public class City
{
    private int temp;
    private String date;
    private String city_name;
    private List<Forecast> forecast;

    @Override
    public String toString() {
        return  "Cidade: " + city_name +
                "<br>Temperatura Atual: " + temp +
                "<br>Data Atual: " + date +
                "<br><br>Previsoes Futuras: " + forecast;
    }
}
