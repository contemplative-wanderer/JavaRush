package com.danilenko.helloworld.JavaRush.Lev3.dec19.L04;

public class D extends C{

    public String i;

    public D(String a, int b) {
        i = a;
        super.i = b;
    }

    public void print() {
        System.out.println("D.i = " + i);
        super.print();
    }
}
