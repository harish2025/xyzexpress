package com.training.first.third;

import java.sql.SQLOutput;
import java.util.Locale;

public class Stringmethod {
    public static void main(String[] args) {
        String str="kasinathan";
         String str2 ="Kasi@1709";
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase());
        System.out.println(str.equals(str2));
        System.out.println(str.getBytes());
        System.out.println(str2.contains("@"));

    }

}
