package com.dest.rockpaperscissors.service;

import com.dest.rockpaperscissors.entity.Bot;
import com.dest.rockpaperscissors.entity.Data;
import com.dest.rockpaperscissors.entity.Player;
import com.dest.rockpaperscissors.utility.InputUtil;

import java.util.Scanner;

import static com.dest.rockpaperscissors.entity.Data.*;

public class Play {

    private void display() {
        System.out.println("=======================");
        System.out.println("| ROCK PAPER SCISSORS |");
        System.out.println("=======================");
        System.out.println("1. Rock               |");
        System.out.println("2. Paper              |");
        System.out.println("3. Scissors           |");
        System.out.println("=======================");
    }

    public void play() {
        display();

        var data = new Data[]{ROCK, PAPER, SCISSORS};

        int player = Player.turn();
        int bot = Bot.turn();

        System.out.println("=======================");
        System.out.println("Player : " + data[player]);
        System.out.println("Bot : " + data[bot]);
        System.out.println("=======================");

        winLose(data[player], data[bot]);

        System.out.println("=======================");

        tryAgain();
    }

    private void tryAgain() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Try Again? (y/n) : ");
            String s = scanner.nextLine();
            if (s.equals("y")) {
                System.out.println(" ");
                play();
            } else {
                break;
            }
        }
    }

    private void winLose(Data player, Data bot) {
        if ((player == ROCK) && (bot == SCISSORS)) {
            System.out.println(player + " > " + bot);
            System.out.println("Player Win!");
        } else if ((bot == ROCK) && (player == SCISSORS)) {
            System.out.println(player + " < " + bot);
            System.out.println("Bot Win!");
        } else if ((player == Data.PAPER) && (bot == ROCK)) {
            System.out.println(player + " > " + bot);
            System.out.println("Player Win!");
        } else if ((bot == Data.PAPER) && (player == ROCK)) {
            System.out.println(player + " < " + bot);
            System.out.println("Bot Win!");
        } else if ((player == SCISSORS) && (bot == PAPER)) {
            System.out.println(player + " > " + bot);
            System.out.println("Player Win!");
        } else if ((bot == SCISSORS) && (player == PAPER)) {
            System.out.println(player + " < " + bot);
            System.out.println("Bot Win!");
        } else {
            System.out.println(player + " == " + bot);
            System.out.println("Tie!");
        }
    }

}
