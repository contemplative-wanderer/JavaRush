package com.danilenko.helloworld.JavaRush.Lev3;

/*Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x",
        а второе - координата "y"). Известно, что точка не лежит на координатных осях OX и OY.
        Вывести на экран номер координатной четверти, в которой находится данная точка.
        Принадлежность точки с координатами (x, y) к одной из четвертей определяется следующим образом:
        для первой четверти x>0 и y>0;
        для второй четверти x<0 и y>0;
        для третьей четверти x<0 и y<0;
        для четвертой четверти x>0 и y<0.*/

import java.util.Scanner;

public class Lec8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X value: ");
        int x = scanner.nextInt();
        System.out.print("Enter Y value: ");
        int y = scanner.nextInt();

        if (isPositive(x)){
            System.out.println(y > 0 ? "1 quarter" : "4 quarter");
        } else{
            System.out.println(y > 0 ? "2 quarter" : "3 quarter");
        }
    }
    public static boolean isPositive(int x){
        return  x > 0;
    }
}
