package com.chinwe.ch19.enumerated;

enum Search { HITHER, YOU }

public class UpcaseEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER; // Upcast
        // e.values();  // No values() in Enum
        for(Enum en : e.getClass().getEnumConstants()){
            System.out.println(en);
        }
    }
}
