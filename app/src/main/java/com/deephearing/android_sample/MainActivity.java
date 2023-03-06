package com.deephearing.android_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.deephearing.dhdenoise.DHDenoise;

public class MainActivity extends AppCompatActivity {
    private final String SDK_KEY = "YOUR_SDK_KEY";

    private TextView mPackageName;
    private TextView mDeviceModel;
    private TextView mDeviceBrand;
    private TextView mIsExpired;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DHDenoise denoise = new DHDenoise.Builder(SDK_KEY,
                DHDenoise.NNet.BASE,
                DHDenoise.SampleRate.SAMPLE_RATE_16K)
                .build();

        denoise.init();

        mPackageName = findViewById(R.id.package_name);
        mPackageName.setText(denoise.getPackageName());

        mDeviceModel = findViewById(R.id.device_model);
        mDeviceModel.setText(denoise.getDeviceModel());

        mDeviceBrand = findViewById(R.id.device_brand);
        mDeviceBrand.setText(denoise.getDeviceBrand());

        String expiredMsg = "Is Expired : " + denoise.isExpired();
        mIsExpired = findViewById(R.id.is_expired);
        mIsExpired.setText(expiredMsg);
    }
}