package com.chinwe.ch15.generics;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Long> {
    private int n;
    public IterableFibonacci(int count) {
        n = count;
    }
    @Override
    public Iterator<Long> iterator() {
        return new Iterator<Long>() {
            public boolean hasNext() {
                return n > 0;
            }
            public Long next() {
                n--;
                return IterableFibonacci.this.next();
            }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(Long i : new IterableFibonacci(18)){
            System.out.println(i + " ");
        }
    }
}
