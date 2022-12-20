package com.danilenko.helloworld.JavaRush.Lev3.dec09.l05;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        int a = x ^ y;
        x = y;
        y = a ^ x;
    }
}
