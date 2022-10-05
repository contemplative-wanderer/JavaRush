package com.danilenko.helloworld.JavaRush.Lev3.oct5;

/*Сумма кратных чисел
        В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
        Напиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно),
        кратных multiple. Для этого используй цикл for. Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.*/

import java.util.Scanner;

public class L02 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if (start <= end){
            int multiple = scanner.nextInt();
            int summa = 0;
            for (int i = start; i < end; i++){
                if ((i % multiple) != 0){
                    continue;
                }
                summa = summa + i;
            }
            System.out.println(summa);
        } else {
            System.out.println("Ne sootvetstvuet usloviu zadachi - start <= end");
        }
    }
}
