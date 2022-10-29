package com.danilenko.helloworld.JavaRush.Lev3.oct28;

//Напиши предложение массивом

import java.util.Arrays;

public class L03 {

    public static void main(String[] args) {

        char[][] s = new char[3][];

        s[0] = "напиши".toCharArray();
        s[1] = "предложение".toCharArray();
        s[2] = "массивом".toCharArray();

        System.out.println(Arrays.deepToString(s));
    }
}
