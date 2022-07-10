package com.safari;

public abstract class OObject {
    private String name;
    private int x;
    private int y;
    private char prev;                                  //Zmienna przechowująca poprzedni teren na którym obiekt się znajdował

    public OObject(int x, int y, char prev) {
        this.x = x;
        this.y = y;
        this.prev = prev;
    }

    protected OObject() {
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    public char getPrev() {
        return prev;
    }

    protected void setPrev(char prev) {
        this.prev = prev;
    }
}
