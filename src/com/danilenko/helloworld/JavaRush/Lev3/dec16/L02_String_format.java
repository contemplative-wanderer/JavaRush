package com.danilenko.helloworld.JavaRush.Lev3.dec16;

/*String.format()
Сделай так, чтобы метод format(String name, int salary) возвращал строку в таком виде:
Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.
Для этого используй метод String.format().
Требования:
Нужно, чтобы метод format(String, int) использовал метод String.format().
Нужно, чтобы метод format(String, int) возвращал строку согласно условию задачи.*/

public class L02_String_format {

    public static void main(String[] args) {

        System.out.println(format("Амогус", 10000));
    }

    public static String format(String name, int salary) {
        return String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary);
    }
}