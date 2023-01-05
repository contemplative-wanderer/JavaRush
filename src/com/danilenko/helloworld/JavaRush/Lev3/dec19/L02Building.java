package com.danilenko.helloworld.JavaRush.Lev3.dec19;

/*Многосерийный предприниматель
Постройка здания планировалась под ресторан и успешно завершилась, но спустя некоторое время собственники решили переделать его под барбершоп.
Нам нужно сделать так, что бы здание было универсальным, и его назначение можно было менять, не создавая нового.
Для этого создай метод initialize, который будет устанавливать значение полю type (определять тип здания), а конструктор убери.
Требования:
В классе Building должно быть приватное поле type типа String.
В классе Building не должно быть объявленных конструкторов.
В классе Building должен быть не статический метод public void initialize с параметром типа String.
Инициализация поля type должна быть в методе initialize(String).*/

public class L02Building {
    private String type;

    public void initialize(String name) {
        type = name;
        //System.out.println(type);
    }

    public static void main(String[] args) {
        L02Building building = new L02Building();
        building.initialize("Барбершоп");
    }
}
