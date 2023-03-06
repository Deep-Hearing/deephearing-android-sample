package com.deephearing.android_sample;

import android.app.Application;

import com.deephearing.dhdenoise.DeepHearingSDK;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DeepHearingSDK.init(this);
    }
}
