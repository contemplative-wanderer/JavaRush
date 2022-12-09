package com.danilenko.helloworld.JavaRush.Lev3.dec09;

/*Counter
В классе Solution реализуй метод printNumbers(), который выводит числа от 1 до 10 включительно с паузой между выводом
каждого числа — 1,3 миллисекунды. В этом тебе поможет метод sleep(long, int) класса Thread, который должен сработать 9 раз.
Требования:
Реализуй метод printNumbers() согласно условию. */

public class L03 {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.println(i + 1);
                Thread.sleep(1, 300000);
            } else {
                System.out.println(i + 1);
            }
        }
    }
}
