package com.segu.cachetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.segu.cachetest.model.Banner;
import com.segu.cachetest.pref.CachePanner;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CachePanner cachePanner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cachePanner=new CachePanner(this, "ha", new CachePanner.OnDataSuccessListener() {
            @Override
            public void onDataSuccess(List<Banner> banners) {

            }
        });
        cachePanner.load();
    }
}
