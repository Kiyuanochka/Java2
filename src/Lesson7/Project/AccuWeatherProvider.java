package Lesson7.Project;


import com.fasterxml.jackson.databind.ObjectMapper;
import Lesson7.Project.enums.Periods;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.IOException;
import java.io.StringReader;

public class AccuWeatherProvider implements WeatherProvider {

    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECAST_ENDPOINT = "forecasts";
    private static final String CURRENT_CONDITIONS_ENDPOINT = "currentconditions";
    private static final String API_VERSION = "v1";
    private static final String API_KEY = ApplicationGlobalState.getInstance().getApiKey();

    private final OkHttpClient client = new OkHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void getWeather(Periods periods) throws IOException {
        String cityKey = detectCityKey();
        if (periods.equals(Periods.NOW)) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme("http")
                    .host(BASE_HOST)
                    .addPathSegment(CURRENT_CONDITIONS_ENDPOINT)
                    .addPathSegment(API_VERSION)
                    .addPathSegment(cityKey)
                    .addQueryParameter("apikey", API_KEY)
                    .build();

            Request requestHttp = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(url)
                    .build();

            String jsonResponse = client.newCall(requestHttp).execute().body().string();
            //System.out.println(response.body().string());
            ObjectMapper mapper = new ObjectMapper();
            StringReader reader = new StringReader(jsonResponse);

            Parameters parameters = mapper.readValue(reader, Parameters.class);

            System.out.println("In the city " + " on the data " + parameters.getLocalObservationDateTime() + "expected" + parameters.getWeatherText() + ", Temperature");
        } else if (periods.equals(Periods.FIVE_DAYS)) {
            OkHttpClient client = new OkHttpClient();

            HttpUrl url = new HttpUrl.Builder()
                    .scheme("http")
                    .host("dataservice.accuweather.com")
                    .addPathSegment("forecasts")
                    .addPathSegment("v1")
                    .addPathSegment("daily")
                    .addPathSegment("5day")
                    .addPathSegment(cityKey)
                    .addQueryParameter("apikey", API_KEY)
                    .addQueryParameter("language", "en-en")
                    .addQueryParameter("metric", "true")
                    .build();

            System.out.println(url.toString());

            Request requestHttp = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(url)
                    .build();

            String jsonResponse = client.newCall(requestHttp).execute().body().string();

            //System.out.println(jsonResponse);

            ObjectMapper mapper = new ObjectMapper();
            StringReader reader = new StringReader(jsonResponse);
            Parameters[] parameters = mapper.readValue(reader, Parameters[].class);

           for (int i = 0, i<parameters.length, i++){
            System.out.println("In the city " + " on the data " + parameters[i].getLocalObservationDateTime() + "expected" + parameters[i].getWeatherText() + ", Temperature" );}

            //+ parameters.getTemperature().getMetric().getValue()
                  //  + parameters.getTemperature().getMetric().getUnit()

        }
        }





   public String detectCityKey() throws IOException {
        String selectedCity = ApplicationGlobalState.getInstance().getSelectedCity();

        HttpUrl detectLocationURL = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment("locations")
                .addPathSegment(API_VERSION)
                .addPathSegment("cities")
                .addPathSegment("autocomplete")
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("q", selectedCity)
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(detectLocationURL)
                .build();

        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            throw new IOException("Unpossible to read information about the city " +
                    "Kode answer of server = " + response.code() + " body answer = " + response.body().string());
        }
        String jsonResponse = response.body().string();
        System.out.println("Searching the city " + selectedCity);

        if (objectMapper.readTree(jsonResponse).size() > 0) {
            String cityName = objectMapper.readTree(jsonResponse).get(0).at("/LocalizedName").asText();
            String countryName = objectMapper.readTree(jsonResponse).get(0).at("/Country/LocalizedName").asText();
            System.out.println("City is found " + cityName + " in the country " + countryName);
        } else throw new IOException("Server returns 0 cities");

        return objectMapper.readTree(jsonResponse).get(0).at("/Key").asText();
    }

}
