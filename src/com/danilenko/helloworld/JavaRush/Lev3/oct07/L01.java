package com.danilenko.helloworld.JavaRush.Lev3.oct07;

/* Конвертер велечин
Обычно скорость ветра указывается в м/с и не всегда понятно, насколько это много или мало.
Привычнее видеть величину скорости в км/ч, как у автомобиля, велосипеда или другого транспорта.
Поэтому сделаем конвертер величин скорости из м/с в км/ч.
Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
Для округления необходимо использовать метод Math.round().*/

import java.util.Scanner;

public class L01 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Vvedite skorost v m/s: ");
        int speed = scanner.nextInt();

        int x = (int) Math.round(speed * 3.6);
        System.out.println("Skorost = " + x + " km/h");
    }
}
