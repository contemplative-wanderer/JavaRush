package com.danilenko.helloworld.JavaRush.Lev3;

/*Используя цикл while вывести на экран сто раз цитату (переменная quote):
        «Я никогда не буду работать за копейки. Амиго»
        Каждое значение вывести с новой строки.*/

public class L_22_09_30_2 {

    public static void main(String[] args) {

        int i = 0;
        String quote = "Я никогда не буду работать за копейки. Амиго";

        while (i < 100){
            System.out.println(quote);
            i++;
        }
    }
}
