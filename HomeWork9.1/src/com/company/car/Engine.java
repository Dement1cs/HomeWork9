package com.company.car;

public class Engine {

    private String number;
    private String cylinders;
    private double power;

    public Engine (String number, String cylinders, double power){
        this.number = number;
        this.cylinders = cylinders;
        this.power = power;



    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCylinders() {
        return cylinders;
    }

    public void setCylinders(String cylinders) {
        this.cylinders = cylinders;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
