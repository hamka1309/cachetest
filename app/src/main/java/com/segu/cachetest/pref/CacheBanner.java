package com.segu.cachetest.pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.segu.cachetest.model.Banner;

import java.lang.reflect.Type;
import java.util.List;

public class CacheBanner {
    private SharedPreferences pref;
    private final Context context;
    private final String KEY_CACHE_DATA = "key_cache_data";
    private final String KEY_CACHE_TIME = "key_cache_time";

    private String TAG = "TEST_CACHE_DATA";
    private List<Banner> banners;
    private OnDataSuccessListener onDataSuccessListener;


    public CacheBanner(Context context, String cacheName, OnDataSuccessListener onDataSuccessListener) {
        this.context = context;
        this.pref = context.getSharedPreferences(cacheName, Context.MODE_PRIVATE);
        this.onDataSuccessListener = onDataSuccessListener;
    }

    public void setCacheData(String data) {
        this.pref.edit().putString(KEY_CACHE_DATA, data).apply();
    }

    public void setLastTimeCache(long cacheTime) {
        this.pref.edit().putLong(KEY_CACHE_TIME, cacheTime).apply();
    }

    public List<Banner> getDataFromCache() {
        Type type = new TypeToken<List<Banner>>() {
        }.getType();

        return new Gson().fromJson(pref.getString(KEY_CACHE_DATA, ""), type);
    }

    private long getLastTimeCache() {
        return this.pref.getLong(KEY_CACHE_TIME, 0);
    }

    public boolean inValidTimeCache() {
        return System.currentTimeMillis() - getLastTimeCache() > 60 * 1000;
    }

    public void load() {

        if (inValidTimeCache() || getDataFromCache().size() == 0) {
            requestAPI(context);
            return;
        }
        this.banners = getDataFromCache();
        if (onDataSuccessListener != null) {
            onDataSuccessListener.onDataSuccess(this.banners);
            Log.i(TAG, "get data from cache");
        } else {
            Log.e(TAG, "No listener ");
        }
    }

    public void requestAPI(final Context context) {
        Log.i(TAG, "get data from API");
        AndroidNetworking.get("https://pastebin.com/raw/ZSvysLaN")
                .setTag(this)
                .setPriority(Priority.LOW)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        setCacheData(response);
                        setLastTimeCache(System.currentTimeMillis());
                        banners = parseJson(response);
                        if (onDataSuccessListener != null) {
                            onDataSuccessListener.onDataSuccess(banners);
                        } else {
                            Log.e(TAG, "No listener ");
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        Toast.makeText(context, "Request API error", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    public interface OnDataSuccessListener {
        void onDataSuccess(List<Banner> banners);
    }

    public List<Banner> parseJson(String response) {
        Type type = new TypeToken<List<Banner>>() {
        }.getType();
        return new Gson().fromJson(response, type);
    }

}
