package org.example;

import okhttp3.*;
import java.util.Map;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import static org.example.GetKey.logger;
import static org.example.GetKey.get_key;


public class Init {
    public static void app_init() throws IOException, NoSuchAlgorithmException {
        String baseUrl = Urls.INIT_URL;
        String timeStamp = TimeStamp.getTimeStamp();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(baseUrl).newBuilder();
        urlBuilder.addQueryParameter("type", "Android_OS");
        urlBuilder.addQueryParameter("version", "14.19.1");
        urlBuilder.addQueryParameter("regions", "--CN");
        urlBuilder.addQueryParameter("carrier", "46000");
        urlBuilder.addQueryParameter("time", timeStamp);
        urlBuilder.addQueryParameter("key", get_key(timeStamp));

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(Urls.INIT_URL).build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()){
            throw new IOException("Unexpected code" + response);
        }

        String jsonResponse = response.body().string();
        JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
        logger.log(Level.INFO, "App initialization completed");
    }
    public static void submit_device_info(){}
    public static void email_verify(){}
    public static void submit_username(){}
    public static void submit_password(){}
    public static void update_line_account(){}
}



