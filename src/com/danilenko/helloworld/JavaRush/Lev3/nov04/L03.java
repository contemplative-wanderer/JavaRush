package com.danilenko.helloworld.JavaRush.Lev3.nov04;

/*Города-гиганты
        Программа должна выводить количество населения самых крупных городов мира и сравнивать их с самым большим городом — Токио.
Но алгоритм программы немного нарушен. Для исправления ошибки тебе необходимо сделать так, чтобы в строке с выводом
информации о самом крупном городе мира использовались статические переменные класса вместо локальных аргументов метода.
Изменять имена переменных нельзя.
Для вывода информации о самом крупном городе должны использоваться статические переменные класса city и population.
Вывод программы в консоли должен соответствовать условию задачи.*/

public class L03 {

    public static String cityT = "Токио";
    public static double populationT = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Дели", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String city, double population){
        System.out.println("Население города " + city + " составляет " + population + " млн человек.");
        tokio(cityT, populationT);
    }

    public static void tokio(String cityT, double populationT) {
        System.out.println("В то время как в самом густонаселенном городе " + cityT + " население составляет " + populationT + " млн человек.");
    }
}
