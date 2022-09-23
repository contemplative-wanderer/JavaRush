package com.danilenko.helloworld.JavaRush.Lev3;

import java.util.*;
import java.lang.*;

/*Составить программу которая принимает на вход возраст и
определяет, нужно в школу или уже пора в институт.*/

public class Lect4 {

    public static void main(String[] args) {

        Scanner age0 = new Scanner(System.in);
        System.out.print("Enter the person's age: ");
        int age = age0.nextInt();

        if(age < 18) {
            System.out.println("Go to school");
        }
        else if(age == 18) {
            System.out.println("Get ready to enter");
        }
        else{
            System.out.println("Time to go to college");
        }

    }

}
