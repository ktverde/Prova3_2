package br.com.compasso.services;

import br.com.compasso.models.City;
import com.google.gson.Gson;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;

public class WeatherService
{
    public String weatherHtml(String city, String days){
        String content = getWeather(city, days);
        City obj = new Gson().fromJson(content,City.class);
        System.out.println(obj);
        return obj.toString();
    }

    public String weatherJson(String city, String days){
        return getWeather(city, days);
    }

    private String getWeather(String city, String days) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.hgbrasil.com");
        return target.path("/weather")
                .queryParam("city_name", city)
                .queryParam("array_limit", days)
                .queryParam("fields", "only_results,temp,city_name,forecast,max,min,date")
                .queryParam("key", "36bb9351")
                .request().get(String.class);
    }



//    public String meteomatics(){
//
//        String username = "paulos_roberto";
//        String password = "8k64FAKYkz";
//
//        URL url = new URL("https://api.meteomatics.com/2022-03-13T00:00:00Z--2022-03-18T00:00:00Z:PT2H/t_2m:C/-22.899902489371296,-47.06202242689679/json");
//        String encoding = Base64.getEncoder().encodeToString((username + ":" + password).getBytes(StandardCharsets.UTF_8));
//
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setDoOutput(true);
//        conn.setRequestMethod("GET");
//        conn.setRequestProperty("Accept", "application/json");
//        conn.setRequestProperty("Authorization", "Basic " + encoding);
//
//        if (conn.getResponseCode() != 200) {
//            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
//        }
//
//        BufferedReader streamReader = new BufferedReader(new InputStreamReader((conn.getInputStream())));
//
//        StringBuilder responseStrBuilder = new StringBuilder();
//        Cidade cidade = new Cidade("Campinas", "oi");
//        String json = new Gson().toJson(cidade);
//        responseStrBuilder.append(json);
//        String inputStr;
//        while ((inputStr = streamReader.readLine()) != null) {
//            System.out.println(streamReader.readLine());
//            responseStrBuilder.append(inputStr);
//        }
//    }
}
