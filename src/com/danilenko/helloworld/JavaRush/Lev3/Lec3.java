package com.danilenko.helloworld.JavaRush.Lev3;

/*Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том,
что температура тела высокая, низкая или нормальная, в зависимости от условий.*/

import java.util.*;
import java.lang.*;


public class Lec3 {

    public static void main(String[] args) {

        Scanner temp0 = new Scanner(System.in);
        System.out.print("Enter body temperature data: ");
        double temp = temp0.nextDouble();

        if(isHigt(temp)){
            System.out.println("Body temperature is high");
        }
        else if(isLow(temp)){
            System.out.println("Body temperature is low");
        }
        else{
            System.out.println("Body temperature is normal");
        }
    }
    private static boolean isHigt(double n){
        return n > 37.2;
    }
    private static boolean isLow(double n){
        return n < 36.0;
    }
}
