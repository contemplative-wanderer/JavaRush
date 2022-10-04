package com.danilenko.helloworld.JavaRush.Lev3.oct3;

//Вывод чисел до заданного максимума, без вывода чисел кратных 7.

public class L02 {

    public static void main(String[] args) {

        int i = 0;

        //ВАРИАНТ1
        while (i <= 25) {
            i++;
            if ( (i % 7) == 0 ){
                continue;
            }
            System.out.print(i + " ");
        }
        i = 0;
        System.out.println("");

        //ВАРИАНТ 2
        while (i <= 75) {
            if ( (i % 7) == 0 ){
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
