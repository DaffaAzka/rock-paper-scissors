package com.dest.rockpaperscissors.utility;

import java.util.Scanner;

public class InputUtil {

    static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String s1) {
        System.out.print(s1 + " : ");
        return scanner.nextInt();
    }

    public static String inputStr(String s1) {
        System.out.print(s1 + " : ");
        String s = scanner.nextLine();
        return s;
    }

}
