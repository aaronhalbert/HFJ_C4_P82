package com.company;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof Woof");
        } else if (size > 14) {
            System.out.println("Ruff ruff");
        } else {
            System.out.println("Yip yip");
        }
    }
}
