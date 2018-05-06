package com.chinwe.ch19.enumerated;

interface Car {
    int wheels = 100;
}

class MyCar implements Car {
    @Override
    public String toString() {
        return "My Car has whells: "  + wheels;
    }
}

public class DemoTest1 {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        System.out.println(myCar);
    }
}
