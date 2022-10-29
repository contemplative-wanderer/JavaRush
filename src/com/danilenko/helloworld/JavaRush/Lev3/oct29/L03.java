package com.danilenko.helloworld.JavaRush.Lev3.oct29;

/* Методы сравнения массивов:
 - ==
 - a.equals.b
 - Array.equals(a, b)
 - Array.deepEquals(a, b)*/

import java.util.Arrays;

public class L03 {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{1, 2, 3, 4, 5};

        int[][] c = new int[][]{{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}};
        int[][] d = new int[][]{{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}};


        System.out.println("Одномерные массивы");
        System.out.println(a == b);                 // false - сравнивает ссылки
        System.out.println(a.equals(b));            // false - сравнивает ссылки
        System.out.println(Arrays.equals(a, b));    // true - массивы равной длины И элементы равны

        System.out.println();

        System.out.println("Двумерные (многомерные) массивы");
        System.out.println(c.equals(d));               // false - сравнивает ссылки двух массивов
        System.out.println(Arrays.deepEquals(c, d));   // true - массивы равной длины И элементы равны
    }
}
