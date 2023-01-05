package com.danilenko.helloworld.JavaRush.Lev3.dec09;

/* Таймер
В классе L02 реализуй метод setTimer(int, int, int, int, int), который засыпает на определенное время, используя соответствующие методы java.util.concurrent.TimeUnit.
Требования:
Метод setTimer(int, int, int, int, int) должен быть реализован согласно условию.*/

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class L02 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.activeCount());
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("AAAAAAA");
            }
        });
        thread.start();


        Scanner scanner = new Scanner(System.in);
        //System.out.print("Введите время засипания (минуты, секунды, милисекунды, микросекунды, наносекунды): ");
        String[] name = {"minutes", "seconds", "milliSeconds", "microSeconds", "nanoSeconds"};
        int[] times = new int[name.length];
        for (int i = 0; i < name.length; i++) {
            System.out.printf("Введите время засипания %s", name[i]);
            times[i] = scanner.nextInt();
        }

        setTimer(times[0], times[1], times[2], times[3], times[4]);
        System.out.println("Проснулся");
    }
    public static void setTimer(int x, int y, int z, int d, int c) throws InterruptedException {
        TimeUnit.MINUTES.sleep(x);
        System.out.println("111111");
        TimeUnit.SECONDS.sleep(y);
        System.out.println("2222");
        TimeUnit.MILLISECONDS.sleep(z);
        System.out.println("33333");
        TimeUnit.MICROSECONDS.sleep(d);
        System.out.println("44444");
        TimeUnit.NANOSECONDS.sleep(c);
    }
}
