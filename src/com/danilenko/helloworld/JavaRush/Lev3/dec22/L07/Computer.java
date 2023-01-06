package com.danilenko.helloworld.JavaRush.Lev3.dec22.L07;

/*Собираем компьютер
Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь. В классе компьютер в конструкторе создай объекты классов-составляющих компьютера.
Требования:
В отдельных файлах должны быть публичные классы Computer, Keyboard, Monitor, Mouse, SystemUnit.
В конструкторе класса Computer нужно создать 4 объекта разных "комплектующих"*/

public class Computer {
    public static void main(String[] args) {
        Computer computer = new Computer();

    }
    public Computer(){
        Keyboard keyboard = new Keyboard("New Keyboard");
        Monitor monitor = new Monitor("New Monitor");
        Mouse mouse = new Mouse("New Mouse");
        SystemUnit systemUnit = new SystemUnit("New SystemUnit");
        System.out.println(keyboard.getKeyboardInit());
        System.out.println(monitor.getMonitorInit());
        System.out.println(mouse.getMouseInit());
        System.out.println(systemUnit.getSystemUnitItem());
    }
}
