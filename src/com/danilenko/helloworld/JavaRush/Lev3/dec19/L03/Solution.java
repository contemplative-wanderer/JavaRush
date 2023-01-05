package com.danilenko.helloworld.JavaRush.Lev3.dec19.L03;

/*Кто тут наследник?
Эта задача нужна для понимания того, как вызывается конструктор базового класса (родителя).
У тебя есть классы ElectricCar, GasCar, HybridCar, которые наследуют класс Car.
Тебе нужно в конструкторах наследников класса Car передать тип автомобиля в конструктор базового класса (родителя), используя super("тип автомобиля").
Для этого в классе Solution в методе main создай 3 объекта: HybridCar, GasCar и ElectricCar.
Вывод должен быть следующий (последовательность может быть любая):
Привет. Я ElectricCar
Привет. Я GasCar
Привет. Я HybridCar
Требования:
Классы ElectricCar, GasCar, HybridCar должны наследоваться от класса Car.
Тело конструктора класса Car не изменяй.
Наследники класса Car должны вызывать конструктор базового класса с соответствующим аргументом.
В методе main должно быть создано 3 объекта классов HybridCar, GasCar и ElectricCar.
Вывод должен соответствовать условию.*/

import com.danilenko.helloworld.JavaRush.Lev3.dec19.L03.car.ElectricCar;
import com.danilenko.helloworld.JavaRush.Lev3.dec19.L03.car.GasCar;
import com.danilenko.helloworld.JavaRush.Lev3.dec19.L03.car.HybridCar;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код

        //new Car("Flying Car");
        new HybridCar();
        GasCar c2 = new GasCar();
        ElectricCar c3 = new ElectricCar();

    }
}
