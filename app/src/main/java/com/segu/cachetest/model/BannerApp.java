package com.segu.cachetest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BannerApp {
    @SerializedName("title")
    private String title;
    @SerializedName("desc")
    private String desc;
    @SerializedName("screenshorts")
    private List<String> screenshots;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<String> screenshots) {
        this.screenshots = screenshots;
    }

    @Override
    public String toString() {
        return "BannerApp{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", screenshots=" + screenshots +
                '}';
    }
}
