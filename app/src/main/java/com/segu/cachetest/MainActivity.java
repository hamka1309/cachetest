package com.segu.cachetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.segu.cachetest.model.Banner;
import com.segu.cachetest.pref.CacheBanner;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CacheBanner cachePanner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cachePanner=new CacheBanner(this, "ha", new CacheBanner.OnDataSuccessListener() {
            @Override
            public void onDataSuccess(List<Banner> banners) {

            }
        });
        cachePanner.load();
    }
}
