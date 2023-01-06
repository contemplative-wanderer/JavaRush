package com.danilenko.helloworld.JavaRush.Lev3.dec22;

/*Ежик и яблоко
Наша задача — накормить ежика. Нужно в методе main создать один объект Apple и один объект Hedgehog, у которого вызвать метод eat и передать нужный аргумент — яблоко.
Требования:
В классе Hedgehog должен существовать вложенный класс public static class Apple.
В классе Hedgehog должен существовать не статический, публичный void метод eat(Apple).
В методе main должен быть создан один объект класса Apple.
В методе main должен быть создан один объект класса Hedgehog.
В методе main у объекта класса Hedgehog нужно вызвать метод eat и передать созданный объект класс Apple.*/

public class L03Hedgehog {

    public static class Apple {
    }

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Apple app = new Apple();
        L03Hedgehog hedgehog = new L03Hedgehog();
        hedgehog.eat(app);
    }
}
