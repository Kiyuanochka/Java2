package Lesson8;



import Lesson8.enums.Periods;
import Lesson8.entity.WeatherData;
import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException;
    WeatherData getAllFromDb() throws IOException;

}
