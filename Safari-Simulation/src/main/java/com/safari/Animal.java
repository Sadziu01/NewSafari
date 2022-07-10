package com.safari;

import java.util.Random;

public abstract class Animal extends OObject{

    private int food;
    private int water;
    private int hp;
    private int speed;          //Wartość speed, im wyższa wartość tym zwierze jest wolniejsze, opytmalnie powinna ona wynosić maxymalnie 3
    private int foodPerRound;
    private int waterPerRound;


    public Animal() {
        food = 100;
        water = 100;
        hp = 100;
    }

    protected void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    protected void setWater(int water) {
        this.water = water;
    }

    public int getWater() {
        return water;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    protected void setFoodPerRound(int foodPerRound) {
        this.foodPerRound = foodPerRound;
    }

    protected void setWaterPerRound(int waterPerRound) {
        this.waterPerRound = waterPerRound;
    }

    protected void move() {                             //Ruch zwierzęcia jest losowy, może on ruszyć się w 8 różnych kierunkach
        int direction = new Random().nextInt(8);
        switch (direction) {
            case 0:
                setY(getY() - 1);
                break;
            case 1:
                setX(getX() + 1);
                break;
            case 2:
                setY(getY() + 1);
                break;
            case 3:
                setX(getX() - 1);
                break;
            case 4:
                setY(getY() - 1);
                setX(getX() - 1);
                break;
            case 5:
                setY(getY() - 1);
                setX(getX() + 1);
                break;
            case 6:
                setY(getY() + 1);
                setX(getX() - 1);
                break;
            case 7:
                setY(getY() + 1);
                setX(getX() + 1);
                break;
        }
    }

    protected void drink(){
        water += waterPerRound;
        if (water > 100) water = 100;
    }

    protected void eat(){
        food += foodPerRound;               //każde zwierzę ma unikalna wartość z jaką traci picie i jedenie
        if (food > 100) food = 100;
    }

    protected void hp(){
        if (food <= 0 )
            hp -= 10;
        if (water <= 0 )
            hp -= 10;
    }

    protected void lossStats(){
        setFood(getFood()-foodPerRound);
        if(getFood() < 0){
            setFood(0);
        }
        setWater(getWater()-waterPerRound);
        if(getWater() < 0){
            setWater(0);
        }
    }

    protected abstract boolean canMove(int nextX, int nextY, Savanna savanna);
}
