package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Daily_forecast {
    @SerializedName("date")
    public String date;

    @SerializedName("tmp_max")
    public String max;

    @SerializedName("tmp_min")
    public String min;

    @SerializedName("cond_txt_d")
    public String info;

}