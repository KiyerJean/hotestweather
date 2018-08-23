package android.hotestweather.com.hotestweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by jinty on 2018/8/23.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
