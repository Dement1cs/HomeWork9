package com.company.ex1;

public class Test {

    public static void main(String[] args) {

        int a1 = Calculator.addCalc(1000, 3000);
        int a2 = Calculator.subCalc(5000, 3500);
        int a3 = Calculator.mulCalc(5000, 3500);
        int a4 = Calculator.divCalc(5000, 3500);

        double b1 = Calculator.addCalc(10.30, 10.50);
        double b2 = Calculator.subCalc(20.30, 90.50);
        double b3 = Calculator.multCalc(30.30, 80.50);
        double b4 = Calculator.divCalc(40.30, 270.50);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
