package com.danilenko.helloworld.JavaRush.Lev3.nov05;

import java.util.Arrays;

public class L01 {

    public static int[][] fill(int[][] data, int value) {
        int[][] array = new int[data.length][];
        for (int i = 0; i < data.length; i++) {
            array[i] = new int[data[i].length];
            for (int j = 0; j < data[i].length; j++) {
                array[i][j] = value;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] months = {{31, 28}, {31, 30, 31}, {30, 31, 31}};
        int[][] fill = fill(months, 8);
        System.out.println(Arrays.deepToString(months));
        System.out.println(Arrays.deepToString(fill));
    }
}
