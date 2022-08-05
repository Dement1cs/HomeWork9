package com.company.car;

public class Test {

    public static void main(String[] args) {

        Wheel michelin = new Wheel("Michelin", 17, "winter");
        Wheel michelin2 = new Wheel("Michelin", 17, "winter");
        Wheel michelin3 = new Wheel("Michelin", 17, "winter");
        Wheel michelin4 = new Wheel("Michelin", 17, "winter");
        Wheel[] wheels = {michelin, michelin2, michelin3, michelin4};
        Engine X302 = new Engine("ed23442f", "W", 300);

        Car car = new Car("Audi", "s5", 2019);
        car.setWheels(wheels);
        car.setEngine(new Engine("ed23442f", "W", 300));

    }
}
