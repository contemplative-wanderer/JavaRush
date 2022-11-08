package com.danilenko.helloworld.JavaRush.Lev3.nov08;

/* Странное деление
В методе main вызови метод div() с таким аргументом, чтобы вывод в консоли был "NaN".
Код метода div() изменять нельзя.
Требования:
В методе main() должен вызываться метод div().
Результатом вызова метода div() должен быть вывод в консоли "NaN".
Код метода div() не изменяq */

public class L03 {

    public static double Infinity;

    public static void main(String[] args) {
        double a = Infinity;
        double b = Infinity;
        div(a, b);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
