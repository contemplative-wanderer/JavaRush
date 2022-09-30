package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.Scanner;

/*Напиcать программу, которая будет считывать с клавиатуры возраст.
        Если возраст от 20 до 60 (включительно), то выводить ничего не нужно,
        иначе - вывести фразу "можно не работать". Сделать это можно (и нужно!)
        с помощью только одного оператора if без else. Подсказка : используй логический оператор "||"*/

public class Lec7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you: ");
        int age = scanner.nextInt();

        if(age < 20 || age > 60){
            System.out.println("Mogno ne rabotat");
        }
    }
}
