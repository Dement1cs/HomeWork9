package com.company.car;

public class Wheel {

    private String model;
    private int radius;
    private  String season;

    public Wheel (String model, int radius, String season){
        this.model = model;
        this.radius = radius;
        this.season = season;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
