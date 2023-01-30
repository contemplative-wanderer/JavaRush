package com.danilenko.helloworld.JavaRush.Lev3.jan.jan30;

/*Метод деления
Реализуй метод divide(double a, double b) так, чтобы в консоли выводился результат деления числа a на число b.
Должно выводиться следующее значение:
   Double.POSITIVE_INFINITY, если верен любой из следующих пунктов:
a положительное и b равно 0;
a равно Double.POSITIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;
   Double.NEGATIVE_INFINITY, если верен любой из следующих пунктов:
a отрицательное и b равно 0;
a равно Double.NEGATIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
a равно Double.POSITIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;
   Double.NaN, если верен любой из следующих пунктов:
a равно 0 и b равно 0;
хотя бы один из операндов равен Double.NaN;
a равно Double.POSITIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
a равно Double.POSITIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
a равно Double.NEGATIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
Иначе выводить результат деления a на b.
Требования:
Метод divide(double a, double b) должен выводить в консоли результат деления числа a на число b.
Метод divide(double a, double b) должен выводить в консоли "Infinity" согласно пункту 1 условия.
Метод divide(double a, double b) должен выводить в консоли "-Infinity"согласно пункту 2 условия.
Метод divide(double a, double b) должен выводить в консоли "NaN" согласно пункту 3 условия. */

public class L02Solution {

    public static void main(String[] args) {
        divide(200, 20);
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
    }

    public static void divide(double a, double b) {

        if (a > 0 && b == 0) {
            System.out.println(Double.POSITIVE_INFINITY);
        } else if (a == Double.POSITIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY) {
            System.out.println(Double.POSITIVE_INFINITY);
        } else if (a == Double.NEGATIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY) {
            System.out.println(Double.POSITIVE_INFINITY);
        } else if (a < 0 && b == 0) {
            System.out.println(Double.NEGATIVE_INFINITY);
        } else if (a == Double.NEGATIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY) {
            System.out.println(Double.NEGATIVE_INFINITY);
        } else if (a == Double.POSITIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY) {
            System.out.println(Double.NEGATIVE_INFINITY);
        } else if (a == 0 && b == 0) {
            System.out.println(Double.NaN);
        } else if (a == Double.NaN || b == Double.NaN) {
            System.out.println(Double.NaN);
        } else if (a == Double.POSITIVE_INFINITY && b == Double.POSITIVE_INFINITY) {
            System.out.println(Double.NaN);
        } else if (a == Double.POSITIVE_INFINITY && b == Double.NEGATIVE_INFINITY) {
            System.out.println(Double.NaN);
        } else if (a==Double.NEGATIVE_INFINITY && b==Double.POSITIVE_INFINITY) {
            System.out.println(Double.NaN);
        } else if (a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY) {
            System.out.println(Double.NaN);
        } else {
            System.out.println(a/b);
        }
    }
}
