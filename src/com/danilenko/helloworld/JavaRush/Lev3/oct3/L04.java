package com.danilenko.helloworld.JavaRush.Lev3.oct3;

/*Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3.
Для этого используй цикл while.
Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.*/

public class L04 {

    public static void main(String[] args) {

        int number = 0;

        while(number < 100){
            number++;
            if (number % 3 == 0){
                continue;
            }
            System.out.print(number + " ");
        }
    }
}
