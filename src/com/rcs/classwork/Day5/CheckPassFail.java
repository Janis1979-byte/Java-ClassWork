package com.rcs.classwork.Day5;

import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {
        System.out.println("Ievadam ciparu : ");
        Scanner scanner = new Scanner(System.in);
        int dati = scanner.nextInt();
        scanner.close();
        if (dati >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
