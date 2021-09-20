package com.school;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.*;
import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetRequest {


    public static void OpenService() throws Exception {
        String key = new String("55488769bf2f6feca61987fd6341fe08");
        String city = "Kazan";
//        String url = "http://api.openweathermap.org/data/2.5/weather?q=Kazan&units=metric&appid=55488769bf2f6feca61987fd6341fe08";
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city +"&units=metric&appid=" + key;

        String jsonString = "{\"coord\":{\"lon\":49.12,\"lat\":55.79},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\"base\":\"stations\",\"main\":{\"temp\":-15,\"feels_like\":-20.57,\"temp_min\":-15,\"temp_max\":-15,\"pressure\":1039,\"humidity\":84},\"visibility\":8000,\"wind\":{\"speed\":3,\"deg\":140},\"clouds\":{\"all\":68},\"dt\":1607867542,\"sys\":{\"type\":1,\"id\":9038,\"country\":\"RU\",\"sunrise\":1607835947,\"sunset\":1607861401},\"timezone\":10800,\"id\":551487,\"name\":\"Kazan’\",\"cod\":200}";
        JSONObject obj = new JSONObject(jsonString);


//        System.out.println(st);
//        System.out.println(test);


//        HttpURLConnection httpClient = (HttpURLConnection) new URL(url).openConnection();
//        httpClient.setRequestMethod("GET");
//        int responseCode = httpClient.getResponseCode();
//        System.out.println("\nSending 'GET' request to URL : " + url);
//        System.out.println("Response Code : " + responseCode);
//
//        InputStream is = httpClient.getInputStream();
//        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
//        String text = rd.readLine();
//        System.out.println(text);
//
//
//        try (
//                BufferedReader in = new BufferedReader(
//                        new InputStreamReader(httpClient.getInputStream()))) {
//
//            StringBuilder response = new StringBuilder();
//            String line;
//
//            while ((line = in.readLine()) != null) {
//                response.append(line);
//            }
//
//            //print result
//            System.out.println(response.toString());
//        }
    }

    public static void WeatherBit() throws Exception{
        String key = "56e5f53925d34a09835b12c48679f195";
        String city = "Kazan";

        String url = "http://api.weatherbit.io/v2.0/current?units=M&city="+ city + "&key=" + key;

        String jsonString = "{\"data\":[{\"rh\":84,\"pod\":\"n\",\"lon\":49.12214,\"pres\":1021.8,\"timezone\":\"Europe\\/Moscow\",\"ob_time\":\"2020-12-13 13:34\",\"country_code\":\"RU\",\"clouds\":58,\"ts\":1607866481,\"solar_rad\":0,\"state_code\":\"73\",\"city_name\":\"Kazan\",\"wind_spd\":4,\"wind_cdir_full\":\"south-southeast\",\"wind_cdir\":\"SSE\",\"slp\":1039,\"vis\":5,\"h_angle\":-90,\"sunset\":\"12:10\",\"dni\":0,\"dewpt\":-17.1,\"snow\":0,\"uv\":0,\"precip\":0,\"wind_dir\":150,\"sunrise\":\"05:04\",\"ghi\":0,\"dhi\":0,\"aqi\":39,\"lat\":55.78874,\"weather\":{\"icon\":\"c02n\",\"code\":802,\"description\":\"Scattered clouds\"},\"datetime\":\"2020-12-13:13\",\"temp\":-15,\"station\":\"UWKD\",\"elev_angle\":-13.94,\"app_temp\":-22.7}],\"count\":1}";

        JSONObject obj = new JSONObject(jsonString);

        JSONArray arr = obj.getJSONArray("data");

        System.out.println(arr.getJSONObject(0).getString("city_name"));
        System.out.println(arr.getJSONObject(0).getInt("temp"));

//        System.out.println(st);

//        HttpURLConnection httpClient = (HttpURLConnection) new URL(url).openConnection();
//        httpClient.setRequestMethod("GET");
//        int responseCode = httpClient.getResponseCode();
//        System.out.println("\nSending 'GET' request to URL : " + url);
//        System.out.println("Response Code : " + responseCode);
//
//        InputStream is = httpClient.getInputStream();
//        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
//        String text = rd.readLine();
//        System.out.println(text);

    }
}
