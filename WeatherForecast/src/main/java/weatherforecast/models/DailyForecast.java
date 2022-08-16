package weatherforecast.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DailyForecast {
    private Integer number;
    private String name;
    private String startTime;
    private String endTime;
    private Boolean isDayTime;
    private Integer temperature;
    private String temperatureUnit;
    private String windSpeed;
    private String shortForecast;
    private String detailedForecast;
}
