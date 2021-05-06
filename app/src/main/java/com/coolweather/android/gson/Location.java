package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("id")
    public String weatherId;

    @SerializedName("adm2")
    public String cityName;

}
