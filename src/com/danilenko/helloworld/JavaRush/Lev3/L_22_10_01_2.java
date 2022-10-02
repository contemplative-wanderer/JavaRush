package com.danilenko.helloworld.JavaRush.Lev3;

/*Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник
        размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.*/

public class L_22_10_01_2 {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        while (a < 5){
            while (b < 10){
                System.out.print("Q");
                b++;
            }
            b =0;
            System.out.println();
            a++;
        }
        a = 0;
    }
}
