package com.danilenko.helloworld.JavaRush.Lev3;

/*Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный
        прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
        Незаполненная часть состоит из пробелов.*/

public class L_22_10_01_3 {

    public static void main(String[] args) {

        int a = 0;

        while (a < 20) {
            System.out.print("Б");
            a++;
        }
        a = 0;
        System.out.println("");
        while (a < 8) {
            System.out.print("Б");
            int b = 0;
            while (b < 18) {
                System.out.print(" ");
                b++;
            }
            b = 0;
            System.out.print("Б");
            System.out.println("");
            a++;
        }
        a = 0;
        while (a < 20){
            System.out.print("Б");
            a++;
        }
        a = 0;
    }
}
