package com.danilenko.helloworld.JavaRush.Lev3.febr.febr27;

/*Солнечная система
В 3020 году ученые научились выращивать новые планеты, одну из которых отправили в космос на орбиту Солнца.
Эта планета находится между Землей и Марсом.
Реализуй метод createNewPlanet(String), который должен добавлять переданную планету в список planets сразу после Земли. Посмотри, как изменился порядок следования планет.
Методы main(), addPlanets() и print() не принимают участие в проверке.
Требования:
Метод createNewPlanet(String) должен добавлять переданную планету в список planets на следующую позицию после Земли.*/

import java.util.ArrayList;

public class SolarSystem {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Звезда Смерти");
        print();
    }

    public static void createNewPlanet(String planetName) {
        planets.add(3, planetName);
    }

    public static void addPlanets() {
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%-15s — %d-я планета от Солнца", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}
