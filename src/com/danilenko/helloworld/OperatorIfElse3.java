package com.danilenko.helloworld;

import java.util.Scanner;

public class OperatorIfElse3 {

    public static void main(String[] args) {

        Scanner ox = new Scanner(System.in);
        Scanner oy = new Scanner(System.in);
        System.out.print("Enter X value: ");
        double x = ox.nextDouble();
        System.out.print("Enter Y value: ");
        double y = oy.nextDouble();
        System.out.println("");

        if (x > y){
            System.out.println(x + " more " + y);
        }
        else if (x == y){
            System.out.println("X is equal to Y");
        }
        else if (x < y){
            System.out.println("X = " + x + " less " + "Y = " + y);
        }

    }

}
