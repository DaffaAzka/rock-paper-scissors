package com.dest.rockpaperscissors.entity;

import com.dest.rockpaperscissors.utility.InputUtil;

import java.util.Scanner;

public class Player {

    static Scanner scanner = new Scanner(System.in);

    public static int turn() {
        int choose = InputUtil.inputInt("Your Choice");

        if (choose <= 3) {
            return (choose - 1);
        } else {
            turn();
        }

        return 0;
    }

}
