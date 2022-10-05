package com.danilenko.helloworld.JavaRush.Lev3.oct5;

//Четные числа
/* Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
Каждое значение нужно выводить с новой строки.*/

public class L01 {

    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
