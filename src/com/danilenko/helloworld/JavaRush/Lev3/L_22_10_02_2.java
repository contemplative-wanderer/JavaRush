package com.danilenko.helloworld.JavaRush.Lev3;

/*Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный
        прямоугольник (его контур) размером "a" (высота) на "b" (ширина) из символов '_' / '-' / '|'.
        Незаполненная часть состоит из пробелов.*/

import java.util.Scanner;

public class L_22_10_02_2 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Zadaite chirinu figuri: ");
        int wid = scanner.nextInt();
        System.out.print("Zadaite visotu figuri: ");
        int heig = scanner.nextInt();

        int i = 0;
        while (i < wid){
            System.out.print("_");
            i++;
        }
        i =0;
        System.out.println();
        while (i < heig){
            System.out.print("|");
            int j = 0;
            while (j < wid - 2){
                System.out.print(" ");
                j++;
            }
            j = 0;
            System.out.print("|");
            System.out.println();
            i++;
        }
        i = 0;
        while (i < wid){
            System.out.print("-");
            i++;
        }
        i = 0;
    }
}
