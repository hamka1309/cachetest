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


    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    public float getPriority() {
        return priority;
    }

    public void setPriority(float priority) {
        this.priority = priority;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public StoreListing getStoreListing() {
        return storeListing;
    }

    public void setStoreListing(StoreListing storeListing) {
        this.storeListing = storeListing;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBanner_1024x500() {
        return banner_1024x500;
    }

    public void setBanner_1024x500(String banner_1024x500) {
        this.banner_1024x500 = banner_1024x500;
    }

    public String getBannner_965_750() {
        return bannner_965_750;
    }

    public void setBannner_965_750(String bannner_965_750) {
        this.bannner_965_750 = bannner_965_750;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getBanner_video() {
        return banner_video;
    }

    public void setBanner_video(String banner_video) {
        this.banner_video = banner_video;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "campaignId='" + campaignId + '\'' +
                ", id='" + id + '\'' +
                ", banner='" + banner + '\'' +
                ", icon='" + icon + '\'' +
                ", interaction='" + interaction + '\'' +
                ", priority=" + priority +
                ", rating=" + rating +
                ", storeListing=" + storeListing +
                ", type=" + type +
                ", url='" + url + '\'' +
                ", banner_1024x500='" + banner_1024x500 + '\'' +
                ", bannner_965_750='" + bannner_965_750 + '\'' +
                ", active=" + active +
                ", banner_video='" + banner_video + '\'' +
                '}';
    }
}
