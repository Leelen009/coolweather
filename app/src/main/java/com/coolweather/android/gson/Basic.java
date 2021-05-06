package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("parent_city")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

}
