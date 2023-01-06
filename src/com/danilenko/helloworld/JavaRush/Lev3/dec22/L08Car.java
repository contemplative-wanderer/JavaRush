package com.danilenko.helloworld.JavaRush.Lev3.dec22;

/*Автопроизводитель
Давай создадим каталог новых моделей авто у нас на производстве. Для этого нам нужно создать один метод initialize, который будет
инициализировать такие поля объекта типа Car: модель, год выпуска, цвет.
Requirements:
1. В классе Car должно быть приватное поле model типа String.
2. В классе Car должно быть приватное поле year типа int.
3. В классе Car должно быть приватное поле color типа String.
4. В классе Car не нужно объявлять какие-либо конструкторы.
5. В классе Car должен быть не статический метод public void initialize с параметрами типа String, int, String.
6. Инициализация полей model, year, color должна производиться в методе initialize(String model, int year, String color).*/

public class L08Car {
    private String model;
    private int year;
    private String color;


    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println("модель " + model + " год " + year + " цвет " + color);

    }

    public static void main(String[] args) {
        L08Car ferrari = new L08Car();
        ferrari.initialize("ferrari", 2021, "yellow");
    }
}