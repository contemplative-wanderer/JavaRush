package com.danilenko.helloworld;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Lesson {
        public static void main(String[] args) {
            System.out.println("name:");
            System.out.println(new Scanner(System.in).nextLine());
            System.out.println("age:");
            Scanner console = new Scanner(System.in);
            int age = console.nextInt();
            if (age == 11){
                System.out.println("Abobus");
            }

        }
}

