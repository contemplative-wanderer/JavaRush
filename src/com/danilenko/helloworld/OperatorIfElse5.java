package com.danilenko.helloworld;

import java.util.Scanner;

public class OperatorIfElse5 {

    public static void main(String[] args) {

        Scanner a0 = new Scanner(System.in);
        System.out.print("Enter divisor 'a': ");
        double a = a0.nextDouble();
        Scanner b0 = new Scanner(System.in);
        System.out.print("Enter dividend 'b': ");
        double b = b0.nextDouble();

        if(b % a == 0){
            System.out.println("\n" + "'a' is a divisor of 'b'");
        }
        else{
            System.out.println("\n" + "'a' is not a divisor of 'b'");
        }

    }

}
