package com.danilenko.helloworld;

import java.util.*;
import java.lang.*;
import java.awt.*;
import java.io.*;

public class DoubleNumber {

    public static void main(String[] args) {

        Examination examination = new Examination();
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


    }

    public static class Examination{

        public int number;

        public int toInteger(){
            return number;
        }


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


    }
*/


}
