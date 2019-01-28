package com.example.multipleviewrecyclerview;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class QueryUtils {

    private String data;

    public QueryUtils(String data) throws JSONException {
        this.data = data;
    }

    JSONObject jsonResponse = new JSONObject(data);
    JSONArray features = jsonResponse.getJSONArray("features");
    JSONObject jsonObj = features.getJSONObject(0);
    JSONObject properties = jsonObj.getJSONObject("properties");
    Double magnitude = properties.getDouble("mag");
    String location = properties.getString("place");
    Long time = properties.getLong("time");
    String url = properties.getString("url");


}
