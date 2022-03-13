package br.com.compasso.resources;

import br.com.compasso.models.City;
import br.com.compasso.services.WeatherService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;

@Path("/weather")
public class MyResource {
    private WeatherService weatherService = new WeatherService();

    @Path("/json")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String weatherJson(@FormParam("city") String city,
                              @FormParam("days") String days) throws IOException {

        return weatherService.weatherJson(city, days);
    }
    @Path("/html")
    @POST
    @Produces(MediaType.TEXT_HTML)
    public String weatherHtml(@FormParam("city") String city,
                              @FormParam("days") String days) throws IOException {

        return weatherService.weatherHtml(city, days);
    }
}
