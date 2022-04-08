package com.example.datatypesandlayout;

public class Mountain {
    private int height;
    private String name;
    private String location;
    private Boolean hasSnow;
    private int deaths;

    public Mountain (int h, String n, String l, boolean s, int d) {
        height = h;
        name = n;
        location = l;
        hasSnow = s;
        deaths = d;
    }

    public int getHeight () {
        return height;
    }
    public String getName () {
        return name;
    }
    public String getLocation () {
        return location;
    }
    public Boolean getHasSnow () {
        return hasSnow;
    }
    public int getDeaths () {
        return deaths;
    }

    public void setHeight (int h) {
        height = h;
    }
    public void setName (String n) {
        name = n;
    }
    public void setLocation (String l) {
        location = l;
    }
    public void setHasSnow (Boolean s) {
        hasSnow = s;
    }
    public void setDeaths (int d) {
        deaths = d;
    }
}
