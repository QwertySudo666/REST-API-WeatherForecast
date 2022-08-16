package weatherforecast.web.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import weatherforecast.models.PeriodForecast;
import weatherforecast.models.WeatherForecast;
import weatherforecast.service.impl.ForecastServiceImpl;

@RestController
@RequestMapping("api/forecast")
public class RestTemplateController {
    private RestTemplate restTemplate;
    private ForecastServiceImpl forecastService;

    public RestTemplateController(RestTemplate restTemplate, ForecastServiceImpl forecastService) {
        this.restTemplate = restTemplate;
        this.forecastService = forecastService;
    }

    @GetMapping("{office}/{gridX}/{gridY}")
    public ResponseEntity<PeriodForecast> getForecastByGrid(@PathVariable String office, @PathVariable Integer gridX, @PathVariable Integer gridY) {
        // https://api.weather.gov/gridpoints/{office}/{grid X},{grid Y}/forecast
        // https://api.weather.gov/gridpoints/TOP/31,80/forecast
        PeriodForecast period = forecastService.getPeriodForecastByGrid(office, gridX, gridY);
        return ResponseEntity.ok().body(period);
    }

    @GetMapping("{latitude}/{longitude}")
    public ResponseEntity<WeatherForecast> getForecastByLatitudeAndLongitude(@PathVariable Double latitude, @PathVariable Double longitude) {
        WeatherForecast weatherForecast = forecastService.getWeatherForecastByLatitudeAndLongitude(latitude, longitude);
        return ResponseEntity.ok().body(weatherForecast);
    }
}
