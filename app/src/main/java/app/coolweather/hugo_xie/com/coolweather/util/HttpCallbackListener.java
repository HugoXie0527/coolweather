package app.coolweather.hugo_xie.com.coolweather.util;

/**
 * Created by Hugo_Xie on 2016/8/13.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
