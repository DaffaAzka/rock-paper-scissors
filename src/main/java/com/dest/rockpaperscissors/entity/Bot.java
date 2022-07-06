package com.dest.rockpaperscissors.entity;

import java.util.Random;

public class Bot {

    public static int turn() {
        Random random = new Random();
        return random.nextInt(2);
    }

}
