package com.danilenko.helloworld.JavaRush.Lev3.dec09;

/*Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.
Требования:
В методе getPowerOfTwo(int) необходимо возвращать степень двойки.
В методе getPowerOfTwo(int) должен использоваться оператор побитового сдвига влево.*/

public class L06 {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(4));
    }

    public static int getPowerOfTwo(int power) {
        int result = 2;
        result = result << (power - 1);
        return result;
    }
}
