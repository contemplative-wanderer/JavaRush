package com.danilenko.helloworld.JavaRush.Lev3.dec21;

/*Два айфона
В методе main создаются два айфона с одинаковыми параметрами.
В консоли выводится результат их сравнения. Разберись, почему сейчас результат отрицательный и сделай так, чтобы он был положительным.
Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.
Требования:
В классе Iphone должен быть переопределен метод public boolean equals(Object).
Метод equals должен возвращать true для двух равных объектов типа Iphone и false — для разных.
Метод equals должен возвращать false, если в него передали null.*/

public class L01Iphone {
    private String model;
    private String color;
    private int price;

    public L01Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof L01Iphone)) {
            return false;
        }

        L01Iphone l01Iphone = (L01Iphone) obj;

        if (this.price == 0){
            return false;
        }

        if (this.color == null){
            return l01Iphone.color == null;
        }

        if (this.model == null){
            return l01Iphone.model == null;
        }

        return this.price == l01Iphone.price && this.color.equals(l01Iphone.color) && this.model.equals(l01Iphone.model);
    }

    public static void main(String[] args) {
        L01Iphone iphone1 = new L01Iphone("X", "Black", 999);
        L01Iphone iphone2 = new L01Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
