package com.danilenko.helloworld.JavaRush.Lev3.dec10;

/* Флаги
Реализуй методы:
setFlag(int number, int flagPos) — устанавливает значение "1" биту под индексом flagPos числа number и возвращает новое значение.
resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos числа number и возвращает новое значение.
checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos числа number и возвращает true, если значение "1" и false, если "0".*/

public class L01 {

    public static void main(String[] args) {

        int number = 4;
        int flagPos = 2;
        System.out.println(setFlag(number, flagPos));
        System.out.println(resetFlag(number, flagPos));
        System.out.println(checkFlag(number, flagPos));
    }

    public static int setFlag(int number, int flagPos) {
        //напишите тут ваш код a | (1 << b)
        number = number | (1 << flagPos);
        return number;
    }

    public static int resetFlag(int number, int flagPos) {
        //напишите тут ваш код a & ~(1 << b)
        number = number & ~(1 << flagPos);
        return number;
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишите тут ваш код
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}