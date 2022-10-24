package com.danilenko.helloworld.JavaRush.Lev3.oct24;

/*В методе main проинициализируй переменные intArray и doubleArray
массивами соответствующих типов, размер которых равен 10.*/

public class L01 {

    public static int[] intArray;
    public static double[] doubleArray;

    public static void main(String[] args) {
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];
        intArray [0] = 5;
        intArray [1] = intArray[0];
        intArray [2] = 7;
        intArray [3] = intArray[0] + intArray[2];
        intArray [4] = 9;
        intArray [5] = intArray[0] + intArray[2];
        intArray [6] = 11;
        intArray [8] = 13;
        doubleArray [0] = 12.345;
        doubleArray [1] = 2.689;
        doubleArray [2] = doubleArray[0] + doubleArray[1];
        doubleArray [3] = 4.423;
        doubleArray [4] = doubleArray[3] * doubleArray[3];
        doubleArray [5] = 6.567;
        doubleArray [6] = doubleArray[1] + doubleArray[9];
        doubleArray [7] = 8.652;
        doubleArray [8] = doubleArray[1] + intArray[3];
        doubleArray [9] = 10.1;

        intArray [7] = (int) (doubleArray[3]) + intArray[6];
        intArray [9] = (int) (doubleArray[3]) + (int) (doubleArray[7]);
    }
}
