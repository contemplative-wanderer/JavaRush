package com.danilenko.helloworld.JavaRush.Lev3.now16;

/* Простое наследование
Построй правильную цепочку наследования классов.
Женщина должна наследоваться от человека, а человек от землянина.
Требования:
Класс Woman должен наследоваться от класса Human.
Класс Human должен наследоваться от класса Terran.*/

public class L01 {

    public  class Terran{}
    public class Human extends Terran{}
    public class Woman extends Human{}
}
