package com.danilenko.helloworld.JavaRush.Lev3.dec21;

/*Создаем свой hashCode
Напиши свою реализацию hashCode, используя переменные model и year. Если эти поля у двух объектов одинаковые,
то должен возвращаться одинаковый hashCode. Если правильно реализовать метод hashCode, вывод должен быть таким:
true
true
true
true
false
false
Требования:
Нельзя изменять метод main.
В классе Car должен быть переопределен метод int hashCode().
Реализуй метод hashCode так, что бы результат работы программы соответствовал условию.*/

public class L02Car {
    private String model;
    private int year;

    public L02Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = result + year;
        return result;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        var lamborghini = new L02Car("Lamborghini", 2020);
        var lamborghini1 = new L02Car("Lamborghini", 2020);
        var ferrari = new L02Car("Ferrari", 2020);
        var ferrari1 = new L02Car("Ferrari", 2020);
        var bugatti = new L02Car("Bugatti", 2020);
        var bugatti1 = new L02Car("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}