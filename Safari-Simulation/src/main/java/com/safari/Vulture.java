package com.safari;

import java.util.Random;

public class Vulture extends Animal {
    private static int idCountV;

    public Vulture() {
        super();
        setName("Vulture-" + idCountV);
        setSpeed(1);
        setFoodPerRound((new Random().nextInt(1)+1) * getSpeed());
        setWaterPerRound((new Random().nextInt(1)+1) * getSpeed());
        idCountV++;
    }
}