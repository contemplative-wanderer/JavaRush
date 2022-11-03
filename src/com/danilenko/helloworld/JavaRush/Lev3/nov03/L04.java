package com.danilenko.helloworld.JavaRush.Lev3.nov03;

/*Калькулятор - возведение в степень
Давай напишем реализацию калькулятора, который будет считать степени чисел.
Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение типа long.
Метод должен возводить полученное значение в заданную степень и возвращать его как результат работы метода.
Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long.
Требования:
Должен быть создан метод public static long cube(long).
Метод cube() должен возвращать результат возведения переданного ему числа в заданную степень.*/

import java.util.Scanner;

public class L04 {

    public static long b = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        int powValue = scanner.nextInt();
        cube(a, powValue);
        System.out.println(b);

    }

    public static long cube(long a, int powValue) {
        for (int i = 0; i < powValue; i++) {
            b = b * a;
        }
        return b;
    }
}
