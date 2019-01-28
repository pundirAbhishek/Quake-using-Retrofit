package com.example.multipleviewrecyclerview;

public class Earthquake {

    private Double magnitude;
    private String location;
    private String time;
    private String url;

    public Earthquake(Double magnitude, String location, String time, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.time = time;
        this.url = url;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }

}
