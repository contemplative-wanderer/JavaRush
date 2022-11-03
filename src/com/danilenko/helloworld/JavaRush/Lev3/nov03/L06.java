package com.danilenko.helloworld.JavaRush.Lev3.nov03;

/*Калькулятор - возведение в третью степень
Давай напишем реализацию калькулятора, который будет считать степени чисел.
Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение типа long.
Метод должен возводить полученное значение в третью степень и возвращать его как результат работы метода.
Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long.
Требования:
Должен быть создан метод public static long cube(long).
Метод cube() должен возвращать результат возведения переданного ему числа в третью степень.*/

import java.util.Scanner;

public class L06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        System.out.println(cube(a));
    }

    public static long cube(long a) {
        return a * a * a;
    }
}