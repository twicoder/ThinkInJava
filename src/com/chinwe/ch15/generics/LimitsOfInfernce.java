package com.chinwe.ch15.generics;

import com.chinwe.ch14.typeinfo.Person;
import net.mindview.util.New;

import java.util.List;
import java.util.Map;

class Pet {}

public class LimitsOfInfernce {
    static void f(Map<Person, List<? extends Pet>> petPeople) {}
    public static void main(String[] args) {
        f(New.map());
    }

}
