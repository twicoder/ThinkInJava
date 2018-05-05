package com.chinwe.ch15.generics;

import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for(int i=0;i<5;i++){
            System.out.println(gen.next());
        }
    }
}
