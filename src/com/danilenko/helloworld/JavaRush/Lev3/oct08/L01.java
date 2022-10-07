package com.danilenko.helloworld.JavaRush.Lev3.oct08;

/* Найти наибольшее положительное n, для которого выполняется условие:
                   3·n2 – 730·n < 0  */

public class L01 {

    public static void main(String[] args) {

        int i = 0;
        int n = 0;

        do {
            n++;
            i = 3 * n * n - 730 * n;
        } while (i < 0);
        n--;
        System.out.println(n);
        System.out.println(i);
    }
}
