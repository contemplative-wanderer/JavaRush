package com.danilenko.helloworld.JavaRush.Lev3.oct5;

/* Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.*/

public class L03 {

    public static void main(String[] args) {

        int i = 0;

        do{
            i++;
            if(i % 5 == 0){
                System.out.print(i + " ");
            }
        } while (i <= 100);
    }
}
