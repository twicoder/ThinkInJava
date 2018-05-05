package com.chinwe.ch15.generics;

import com.chinwe.ch15.generics.watercolors.Watercolors;
import static net.mindview.util.Sets.*;

import java.util.EnumSet;
import java.util.Set;


public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIAN_RED, Watercolors.VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE, Watercolors.BURNT_UMBER);
        System.out.println("set1:" + set1);
        System.out.println("set2:" + set2);
        System.out.println("union(set1,set2): " + union(set1,set2));
        Set<Watercolors> subset = intersection(set1,set2);
        System.out.println("intersection(set1,set2): " + subset);
        System.out.println("difference(set1, subset): " + difference(set1, subset));
        System.out.println("difference(set2, subset): " + difference(set2, subset));
        System.out.println("complement(set1,set2):" + complement(set1, set2));
    }
}
