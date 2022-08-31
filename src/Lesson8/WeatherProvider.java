package Lesson8;

import Lesson7_2.Periods;
import Lesson8.WeatherData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {
    void getWeather(Periods periods) throws IOException, SQLException;

    List<WeatherData> getAllFromDb() throws IOException, SQLException;
}
