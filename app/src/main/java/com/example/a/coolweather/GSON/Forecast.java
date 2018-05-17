package com.example.a.coolweather.GSON;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
    public class Temperature{
        public String max;
        public String min;
    }
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;
}
