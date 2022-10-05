package com.danilenko.helloworld.JavaRush.Lev3.oct5;

/*Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while.*/

public class L04 {

    public static void main(String[] args) {

        int i = 1;

        while(i <= 10){
            System.out.println("Task" + i);
            i++;
        }
    }
}
