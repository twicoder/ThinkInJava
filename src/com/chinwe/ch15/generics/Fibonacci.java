package com.chinwe.ch15.generics;

import net.mindview.util.Generator;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci implements Generator<Long> {
    private int count = 0;
    private Map<Long,Long> dataMap = new HashMap<>();
    @Override
    public Long next() {
        return fib(count++);
    }
    private Long fib(long n) {
        Long val = dataMap.get(n);
        if(val == null){
            Long result = null;
            if(n<2) {
                result = 1L;
            } else {
                result = fib(n-2) + fib(n-1);
            }
            dataMap.put(n,result);
            return dataMap.get(n);
        } else {
            return val;
        }
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for(int i=0;i<92;i++){
            System.out.println(gen.next() + " ");
        }
    }
}
