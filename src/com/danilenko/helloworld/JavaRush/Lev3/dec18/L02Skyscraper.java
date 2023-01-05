package com.danilenko.helloworld.JavaRush.Lev3.dec18;

/*Построим новый жилой комплекс JavaRush Towers
Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
Объявляет о результате постройки.
Объявляет о результате и указывает количество этажей.
Объявляет о результате и указывает застройщика.
Пример вывода:
Небоскреб построен.
Небоскреб построен. Количество этажей - 50
Небоскреб построен. Застройщик - JavaRushDevelopment
Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.
Метод main не участвует в тестировании.
Требования:
В классе Skyscraper должно быть три публичных конструктора.
В классе Skyscraper должен быть конструктор без параметров.
В классе Skyscraper должен быть конструктор с параметром типа int.
В классе Skyscraper должен быть конструктор с параметром типа String.
В конструкторе без параметров вывод должен соответствовать примеру из условия.
В конструкторе с параметром типа int вывод должен соответствовать примеру из условия.
В конструкторе с параметром типа String вывод должен соответствовать примеру из условия.*/

public class L02Skyscraper {

    public static void main(String[] args) {

        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraper1 = new Skyscraper(50);
        Skyscraper skyscraper2 = new Skyscraper("JavaRushDevelopment");
    }

    public static class Skyscraper {

        public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
        public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
        public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

        int Tower;
        String Skyline;

        public Skyscraper() {
            System.out.println(SKYSCRAPER_WAS_BUILD);
        }

        public Skyscraper(int tower) {
            //this.Tower = tower;
            System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + tower);
        }

        public Skyscraper(String skyline) {
            //this.Skyline = skyline;
            System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + skyline);
        }
    }
}
