package com.segu.cachetest.model;

import com.google.gson.annotations.SerializedName;

public class StoreListing {
    @SerializedName("default")
    private BannerApp def;
    @SerializedName("en")
    private BannerApp en;

    public BannerApp getDef() {
        return def;
    }

    public void setDef(BannerApp def) {
        this.def = def;
    }

    public BannerApp getEn() {
        return en;
    }

    public void setEn(BannerApp en) {
        this.en = en;
    }

    @Override
    public String toString() {
        return "StoreListing{" +
                "def=" + def +
                ", en=" + en +
                '}';
    }
}
