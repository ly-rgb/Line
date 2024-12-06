package org.example;

import okhttp3.*;
import java.util.Map;
import java.util.UUID;
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
    public static void submit_device_info(){
        String baseUrl = Urls.SUBMIT_DEVICE_INFO_URL;
        String timeStamp = TimeStamp.getTimeStamp();
        UUID uuid = UUID.randomUUID();

        HttpUrl.Builder urlBuilder = HttpUrl.parse(baseUrl).newBuilder();
        urlBuilder.addQueryParameter("Locale", "en");
        urlBuilder.addQueryParameter("logType", "NeloInit");
        urlBuilder.addQueryParameter("Platform", "Android 13");
        urlBuilder.addQueryParameter("body", "SessionCreated");
        urlBuilder.addQueryParameter("txtToken", "3dda364cdcc04ab08f171b935127a180");
        urlBuilder.addQueryParameter("logLevel", "DEBUG");
        urlBuilder.addQueryParameter("processName", "jp.naver.line.android");
        urlBuilder.addQueryParameter("NetworkType", "Wi-Fi");
        urlBuilder.addQueryParameter("NeloProcessID", uuid.toString());
        urlBuilder.addQueryParameter("host", "localhost");
        urlBuilder.addQueryParameter("Carrier", "Unknown");
        urlBuilder.addQueryParameter("Rooted", "Rooted");
        urlBuilder.addQueryParameter("CountryCode", "cn");
        urlBuilder.addQueryParameter("NeloEvent", "SessionCreated");
        urlBuilder.addQueryParameter("DeviceModel", "Pixel 5");
        urlBuilder.addQueryParameter("NeloSDK", "android-sdk_1.7.0");
        urlBuilder.addQueryParameter("DeviceID", "5b63cdb9f04ec5fdb765a29ee8459d0e");
        urlBuilder.addQueryParameter("logSource", "nelo2-android");
        urlBuilder.addQueryParameter("logTime", timeStamp);
        urlBuilder.addQueryParameter("VersionCode", "141810325");
        urlBuilder.addQueryParameter("@ulogId", get_@ulogId());
        urlBuilder.addQueryParameter("SessionID", get_sessionId());
        urlBuilder.addQueryParameter("NeloInstallID", get_NeloInstallID());
        urlBuilder.addQueryParameter("projectVersion", "14.18.1");
        urlBuilder.addQueryParameter("sendTime", TimeStamp.getTimeStamp());

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(Urls.INIT_URL).build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()){
            throw new IOException("Unexpected code" + response);
        }

        String jsonResponse = response.body().string();
        JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
        logger.log(Level.INFO, "device info submit completed");
    }
    public static void email_verify(){}
    public static void submit_username(){}
    public static void submit_password(){}
    public static void update_line_account(){}
}



