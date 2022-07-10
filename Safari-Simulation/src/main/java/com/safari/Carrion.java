package com.safari;

public class Carrion extends OObject{

    private static int idCountC;
    private int durability;                             //"wytrwałość" truchła, redukowana wraz z konsumpcja

    Carrion(int x, int y, char prev){
        super(x, y, prev);
        setName("Carrion-" + idCountC);
        this.durability = 100;
        idCountC++;
    }

    protected void setDurability(int durabity) {
        this.durability = durabity;
    }

    public int getDurability() {
        return durability;
    }
}