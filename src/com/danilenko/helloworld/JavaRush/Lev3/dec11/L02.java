package com.danilenko.helloworld.JavaRush.Lev3.dec11;

/*Литералы с плавающей точкой
В классе L02 объявлены и проинициализированы семь публичных полей.
Они инициализируются разными значениями — литералами с плавающей точкой. Но программа не компилируется, и нужно это исправить.
Для этого измени типы полей, чтобы они соответствовали значениям. Имена и значения полей не изменяй.
Требования:
Изменить тип поля a, чтобы программа компилировалась.
Изменить тип поля b, чтобы программа компилировалась.
Изменить тип поля c, чтобы программа компилировалась.
Изменить тип поля d, чтобы программа компилировалась.
Изменить тип поля e, чтобы программа компилировалась.
Изменить тип поля f, чтобы программа компилировалась.*/

public class L02 {

    public double a = (int) 0.;
    public float b = (int) .0;
    public byte c = 100;
    public float d = (int) 100.0;
    public double e = (int) 1.11E5;
    public int f = 200;
    public float g = (int) 0.F;

    public static void main(String[] args) {
       L02 solution = new L02();

        System.out.println(solution.a);
        System.out.println(solution.b);
        System.out.println(solution.c);
        System.out.println(solution.d);
        System.out.println(solution.e);
        System.out.println(solution.f);
        System.out.println(solution.g);
    }
}