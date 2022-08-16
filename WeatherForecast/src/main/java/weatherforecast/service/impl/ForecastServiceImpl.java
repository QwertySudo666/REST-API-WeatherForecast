package weatherforecast.service.impl;

import org.springframework.web.client.RestTemplate;
import weatherforecast.models.PeriodForecast;
import weatherforecast.models.WeatherForecast;
import weatherforecast.service.ForecastService;

public class ForecastServiceImpl implements ForecastService {
    @Override
    public PeriodForecast getPeriodForecastByGrid(String office, Integer gridX, Integer gridY) {
        String url = "https://api.weather.gov/gridpoints/" + office + "/" + gridX + "," + gridY + "/forecast";
        RestTemplate restTemplate = new RestTemplate();
        PeriodForecast period = restTemplate.getForObject(url, PeriodForecast.class);
        return period;
    }

    @Override
    public WeatherForecast getWeatherForecastByLatitudeAndLongitude(Double latitude, Double longitude) {
        String url = "https://api.weather.gov/points/" + latitude + "," + longitude;
        RestTemplate restTemplate = new RestTemplate();
        WeatherForecast weatherForecast = restTemplate.getForObject(url, WeatherForecast.class);
        return weatherForecast;
    }
}
