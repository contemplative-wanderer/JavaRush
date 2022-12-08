package com.danilenko.helloworld.JavaRush.Lev3.dec08;

/*Randomizer
В этой задаче тебе предстоит реализовать метод generateNumber(), который будет возвращать случайное число от 0 до 99.
В методе generateNumber() используй метод Math.random().*/

public class L01 {
    public static int generateNumber() {
        return (int) (Math.random() * 100);
    }

    public static void main(String[] args) {
        int x = generateNumber();
        System.out.println(x);
    }
}
