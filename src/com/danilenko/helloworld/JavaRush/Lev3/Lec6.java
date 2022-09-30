package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.Scanner;

/*Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
        Для этого тебе нужно:
        1. Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
        2. Определить возможность существования треугольника по сторонам. Результат вывести на экран.*/

public class Lec6 {

    // Вариант 1
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println(a + b + c - max > max ? "Vozmogno postroit treugolnik": "Ne vozmogno postroit treugolnik");

    // Вариант 2
        int max1 = a;

        if(b > max1){
            max1 = b;
        }
        if (c > max1){
            max1 = c;
        }
        System.out.println(a + b + c - max1 > max1 ? "Vozmogno postroit treugolnik": "Ne vozmogno postroit treugolnik");

    // Вариант 3
        if(b >max1){
            max1 = b;
        }
        if(c >max1){
            max1 = c;
        }
        boolean f = a + b + c - max1 > max1;
            System.out.println(f ?"Vozmogno postroit treugolnik":"Ne vozmogno postroit treugolnik");
    }
}
