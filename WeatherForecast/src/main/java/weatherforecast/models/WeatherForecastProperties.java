package weatherforecast.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WeatherForecastProperties {
    private String cwa;
    private String gridId;
    private String gridX;
    private String gridY;
    private RelativeLocation relativeLocation;
}
