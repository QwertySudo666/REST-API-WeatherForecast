package weatherforecast.service;

import org.springframework.web.bind.annotation.PathVariable;
import weatherforecast.models.PeriodForecast;
import weatherforecast.models.WeatherForecast;

public interface ForecastService {
    public PeriodForecast getPeriodForecastByGrid(String office, Integer gridX, Integer gridY);

    public WeatherForecast getWeatherForecastByLatitudeAndLongitude(Double latitude, Double longitude);
}
