package com.example.multipleviewrecyclerview;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    public String BASE_URL = "https://earthquake.usgs.gov/fdsnws/event/1/";

    @GET("query?format=geojson&starttime=2014-01-01&endtime=2014-01-02")
    Call<JSONResponse> getData();

}
