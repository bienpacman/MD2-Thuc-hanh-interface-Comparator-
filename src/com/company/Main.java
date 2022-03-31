package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cricle[] cricles = new Cricle[3];
        cricles[0] = new Cricle(3.6, "blue");
        cricles[1] = new Cricle(3.7);
        cricles[2] = new Cricle();

        System.out.println("Per-sorted");
        for (Cricle cricle : cricles) {
            System.out.println(cricle);
        }
        Comparator comparator = new CricleComparator();
      Arrays.sort(cricles,comparator);

        System.out.println("After-sorted");
        for (Cricle cricle:cricles) {
            System.out.println(cricle);
        }
    }
}