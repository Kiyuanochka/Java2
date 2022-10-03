package Project;

import java.util.HashMap;
import java.util.Map;
//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "LocalObservationDateTime",
        "Temperature",
        "WeatherText"
})
//@Generated("jsonschema2pojo")
public class DailyForecast {

    @JsonProperty("LocalObservationDateTime")
    private String localObservationDateTime;

    @JsonProperty("Temperature")
    private Temperature temperature;
    @JsonProperty("WeatherText")
    private String weatherText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



    @JsonProperty("LocalObservationDateTime")
    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    @JsonProperty("LocalObservationDateTime")
    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }


    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("WeatherText")
    public void setWeatherText(String weatherText) {this.weatherText = weatherText;}


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public static class Weather {

        private String Metric;
        private String WeatherText;
        @JsonGetter("Metric")
        public String getMetric() {return Metric;        }
        @JsonSetter("Metric")
        public void setMetric(String metric) {Metric = metric;}
        @JsonGetter("WeatherText")
        public String getWeatherText() {return WeatherText;}
        @JsonSetter("WeatherText")
        public void setWeatherText(String weatherText) {WeatherText = weatherText;}

        public Weather(String metric, String weatherText) {
            Metric = metric;
            WeatherText = weatherText;
        }
    }
}
