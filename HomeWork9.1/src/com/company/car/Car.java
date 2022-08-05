package com.company.car;

public class Car {
    private final String mark;
    private final String model;
    private final int year;
    private Engine engine;
    private Wheel[] wheels;

    public Car (String mark, String model, int year){
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }
}