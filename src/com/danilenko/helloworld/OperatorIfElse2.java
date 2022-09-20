package com.danilenko.helloworld;

import java.util.Scanner;


public class OperatorIfElse2 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Enter coordinate X : ");
        double x = number.nextDouble();

        if (x > 4){
            System.out.println("");
            System.out.println("The point fell into the II area");
        }
        else {
            System.out.println("");
            System.out.println("The point fell into the I area");
        }

    }

}
