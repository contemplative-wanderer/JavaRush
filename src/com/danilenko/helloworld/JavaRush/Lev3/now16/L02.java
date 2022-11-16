package com.danilenko.helloworld.JavaRush.Lev3.now16;

/*Наследование переменных
Правильно унаследуй классы:
машину — от транспортного средства;
электрокар — от машины.
Удали дублирующиеся переменные.
Требования:
Класс Car должен наследоваться от класса Vehicle.
Класс ElectricCar должен наследоваться от класса Car.
Дублирующих переменных не должно быть.*/

public class L02 {

    public class Vehicle {
        double maxSpeed;

    }

    public class Car extends Vehicle {
        int wheelCount;
        double weight;
    }

    public class ElectricCar extends Car {
        int enginePower;
    }
}
