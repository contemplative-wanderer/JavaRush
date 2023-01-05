package com.danilenko.helloworld.JavaRush.Lev3.dec20;

/*Зарплата
У нас есть класс Programmer, в котором есть очень важное поле — salary. Наша задача следующая:
нужно добавить возможность получить и изменить значение этого поля, используя геттер и сеттер.
Но есть нюанс: зарплату можно только повышать. Поэтому тебе нужно добавить проверку в сеттер:
если значение аргумента больше текущего значения, то поле salary изменяем, иначе — игнорируем.
Требования:
В классе Programmer должно быть не статическое private int поле salary.
В классе Programmer должен быть публичный геттер для поля salary.
В классе Programmer должен быть публичный сеттер для поля salary.
Сеттер должен изменять значение поля salary, только если входящий аргумент больше текущего значения.
*/

public class L02Programmer {
    private int salary = 10000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        if (newSalary > salary) {
            this.salary = newSalary;
        } else {
            this.salary = salary;
        }
        System.out.println(salary);
    }
}
