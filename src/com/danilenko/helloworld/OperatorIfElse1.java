package com.danilenko.helloworld;

import java.util.*;
import java.lang.*;


public class OperatorIfElse1 {

    public static void main(String[] args) {

        Scanner  val = new Scanner(System.in);
        System.out.print("Enter value X : ");
        double x = val.nextDouble();

        double y;

        if(x > 0){
            y = (double) Math.sin(x);
        }
        else {
            y = 1 - 2 * (double) Math.sin(x);
        }

        System.out.println("Х = " + x);
        System.out.println("Y = " + y);
    }

}
