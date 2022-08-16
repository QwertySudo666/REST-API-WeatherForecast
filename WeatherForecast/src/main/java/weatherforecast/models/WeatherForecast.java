package weatherforecast.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WeatherForecast {
    private String id;
    private String type;
    private WeatherForecastProperties properties;
}
