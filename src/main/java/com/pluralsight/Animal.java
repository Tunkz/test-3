package com.pluralsight;

public class Animal {
    String tail;
    int legs;

    public Animal(String tail, int legs) {
        this.tail = tail;
        this.legs = legs;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
