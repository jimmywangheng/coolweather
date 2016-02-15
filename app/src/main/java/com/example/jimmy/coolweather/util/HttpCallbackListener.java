package com.example.jimmy.coolweather.util;

/**
 * Created by Jimmy on 2016/2/14.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
