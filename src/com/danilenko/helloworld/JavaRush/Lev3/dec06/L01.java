package com.danilenko.helloworld.JavaRush.Lev3.dec06;

/*Утильный класс: часть 2
sqrt(double) — должен возвращать квадратный корень переданного аргумента.
cbrt(double) — должен возвращать кубический корень переданного аргумента.
pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.*/

public class L01 {

    public static void main(String[] args) {

        int a = 25;
        int b = 4;
        double c1 = toSqrt(a);
        double c2 = toCbrt(a);
        double c3 = toPow(a, b);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    public static double toSqrt(int x) {
        return Math.sqrt(x);
    }

    public static double toCbrt(int x) {
        return Math.cbrt(x);
    }

    public static double toPow(int x, int y) {
        return Math.pow(x, y);
    }
}