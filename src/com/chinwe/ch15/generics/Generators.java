package com.chinwe.ch15.generics;

import com.chinwe.ch15.generics.coffee.Coffee;
import com.chinwe.ch15.generics.coffee.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for(int i=0;i<n;i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<>(), new CoffeeGenerator(), 4);
        for(Coffee c : coffee) {
            System.out.println(c);
        }
        Collection<Long> fnumbers = fill(new ArrayList<>(), new Fibonacci(), 12);
        for(Long i : fnumbers) {
            System.out.println(i);
        }
    }
}
