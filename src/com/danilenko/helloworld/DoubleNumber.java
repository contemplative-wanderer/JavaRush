package com.danilenko.helloworld;

import java.util.*;
import java.lang.*;
import java.awt.*;
import java.io.*;

public class DoubleNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ready?");
        System.out.print("Enter the scanner :   ");
        int number1 = scanner.nextInt();

        // Условие ? если правда : если ложь

        System.out.println(isEven(number1) ? "Number " + number1 + " even" : "Number " + number1 + " odd");


        if(isEven(number1)){
                System.out.println("Number " + number1 + " even");
        }
        else {
            System.out.println("Number " + number1 + " not even");
        }
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }



    // option 1 - easy

    /*public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Ready?");
        System.out.print("Enter the number :   ");
        int number1 = number.nextInt();

        if(number1 % 2 == 0){
                System.out.println("Number " + number1 + " even");
        }
        else {
            System.out.println("Number " + number1 + " not even");
        }
    }*/

}
