package com.danilenko.helloworld.JavaRush.Lev3;

        /*Ввести с клавиатуры три целых числа.
        Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
        Если такая пара существует, вывести на экран числа через пробел.
        Если все три числа равны между собой, то вывести все три.*/

import java.util.Scanner;
import java.util.StringJoiner;

public class Lec4 {

    public static void main(String[] args) {

        Scanner number00 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = number00.nextInt();
        System.out.print("Enter the second number: ");
        int b = number00.nextInt();
        System.out.print("Enter the third number: ");
        int c = number00.nextInt();

        // Variant 1
        StringJoiner r = new StringJoiner(" ");
        if (a == b){
            r.add(a + "").add(b + "");
            if(b == c){
                r.add(c + "");
            }
        } else if(b == c) {
            r.add(b + "").add(c + "");
        }
        System.out.println(r);

        // Variant 2
        String result = "";
        if (a == b){
            result = result + a + b;
            if(b == c){
                result = result + c;
            }
        } else if(b == c) {
            result = result + b + c;
        }
        System.out.println(result);

        // Variant 3
        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        }
        else if(a == b) {
            System.out.println(a + " " + b);
        }
        else if (b == c){
            System.out.println(b + " " + c);
        }
        else{
            System.out.println("");
        }
    }
}
