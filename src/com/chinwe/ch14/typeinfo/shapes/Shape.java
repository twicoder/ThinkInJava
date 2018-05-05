package com.chinwe.ch14.typeinfo.shapes;

public abstract class Shape {
    static {
        System.out.println("In Shape { static }");
    }

    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    static {
        System.out.println("In Circle { static }");
    }
    public String toString(){
        return "Circle";
    }
}

class Square extends Shape {
    static {
        System.out.println("In Square { static }");
    }

    public String toString(){
        return "Square";
    }
}

class Triangle extends Shape {
    static {
        System.out.println("In Triangle { static }");
    }

    public String toString(){
        return "Triangle";
    }
}
