package com.segu.cachetest.model;

import com.google.gson.annotations.SerializedName;

public class Banner {
    @SerializedName("campaign_id")
    private String campaignId;
    @SerializedName("id")
    private String id;
    @SerializedName("banner")
    private String banner;
    @SerializedName("icon")
    private String icon;
    @SerializedName("interaction")
    private String interaction;
    @SerializedName("priority")
    private float priority;
    @SerializedName("rating")
    private float rating;
    @SerializedName("store_listing")
    private StoreListing storeListing;
    @SerializedName("type")
    private int type;
    @SerializedName("url")
    private String url;
    @SerializedName("banner_1024x500")
    private String banner_1024x500;
    @SerializedName("banner_965x750")
    private String bannner_965_750;
    @SerializedName("active")
    private boolean active;
    @SerializedName("banner_video")
    private String banner_video;

}
