package com.danilenko.helloworld;

import java.util.Scanner;

public class OperatorIfElse4 {

    public static void main(String[] args) {

        Scanner ox = new Scanner(System.in);
        Scanner oy = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = ox.nextDouble();
        System.out.print("Enter the second number: ");
        double y = oy.nextDouble();
        System.out.println("");

        if(x > y){
            System.out.println(x + " maximum" + "\n" + y + " minimum");
        }
        else if (x == y){
            System.out.println("Two numbers are equal");
        }
        else{
            System.out.println(y + " maximum" + "\n" + x + " minimum");
        }

    }

}
