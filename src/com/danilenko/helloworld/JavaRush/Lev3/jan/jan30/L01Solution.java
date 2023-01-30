package com.danilenko.helloworld.JavaRush.Lev3.jan.jan30;

/*Плата по счетам
В классе Solution есть поле balance, которое описывает баланс средств на банковском счете. При объявлении проинициализируй его значением Integer.MAX_VALUE.
Реализуй метод processPayment(String), который принимает чек и производит списание средств со счета соответственно чеку.
Метод main не принимает участие в проверке.
Требования:
Поле balance должно инициализироваться при объявлении значением Integer.MAX_VALUE.
Метод processPayment(String) должен уменьшать поле balance на значение переданного аргумента. */

public class L01Solution {

    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String check = "147483647";

        System.out.println("Текущий баланс : " + balance);
        processPayment(check);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String check){
        balance = balance - Integer.parseInt(check);
    }
}
