package com.chinwe.ch16;

class Fruit { }
class Apple extends Fruit { }
class Orange extends Fruit { }
public class DemoOfStoreError {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        // java.lang.ArrayStoreExceptionj
        fruit[0] = new Orange();
    }
}
