package weatherforecast.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class PeriodForecastProperties {
    private List<DailyForecast> periods;
}
