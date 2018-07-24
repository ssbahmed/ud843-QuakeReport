package com.example.android.quakereport;

public class Earthquake {
    private String location;
    private Double mag;
    private Long time;
    private String url;

    public Earthquake(Double magntuide ,String place,Long time,String url) {
        this.location = place;
        this.mag = magntuide;
        this.time = time;
        this.url = url;
    }

    public String getLocation() {
        return location;
    }

    public Double getMga() {
        return mag;
    }

    public Long getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }
}
