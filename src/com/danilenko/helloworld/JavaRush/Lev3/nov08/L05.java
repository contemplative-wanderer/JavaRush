package com.danilenko.helloworld.JavaRush.Lev3.nov08;

/*Правильные типы
Реализуй метод setValues(long value), чтобы он устанавливал полученное значение параметра value переменным a, b, c и d.
Изменять типы переменных a, b, c и d нельзя.
Требования:
Типы переменных a, b, c и d не должны измениться.
Метод setValues(long value) должен устанавливать полученное значение переменным a, b, c и d. */

public class L05 {

    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(1000000);
    }

    public static void setValues(long value) {
        d = value;
        c = (int) d;
        b = (short) c;
        a = (byte) b;
    }
}
