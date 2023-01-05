package com.danilenko.helloworld.JavaRush.Lev3.dec20;

/*С крышей или без? Вот в чем вопрос
Ты сделал предзаказ на новенькую Bugatti ровно полгода назад. Сейчас июнь, и было бы неплохо все-таки ездить на кабриолете. Но ты забыл, в каком кузове заказывал машину.
Твоя задача — добавить функциональность для получения текущей конфигурации и изменения её при необходимости. Для этого создай геттеры и сеттеры.
Требования:
В классе Bugatti должно быть три поля: String color, int year, String body.
В классе Bugatti должен быть конструктор по умолчанию.
В классе Bugatti должен быть публичный геттер getBody для поля body.
В классе Bugatti должен быть публичный сеттер setBody(String) для поля body.*/

public class L01Bugatti {
    private String color = "BLACK";
    private int year = 2023;
    private String body = "Coupe";

    //напишите тут ваш код

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "L01Bugatti{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", body='" + body + '\'' +
                '}';
    }
}

