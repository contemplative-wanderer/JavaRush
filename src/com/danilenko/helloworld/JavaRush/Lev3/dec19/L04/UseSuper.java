package com.danilenko.helloworld.JavaRush.Lev3.dec19.L04;

/*D.i = someString
C.i = 2
someString*/

public class UseSuper {

    public static void main(String[] args) {
        D d = new D("someString", 2);
        d.print();
        System.out.println(d.i);
    }
}
