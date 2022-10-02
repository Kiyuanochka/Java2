package Lesson7.Project;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Weather {

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
