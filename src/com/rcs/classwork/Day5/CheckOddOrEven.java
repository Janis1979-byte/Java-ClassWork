package com.rcs.classwork.Day5;

import java.util.Scanner;

public class CheckOddOrEven {
    public static void main(String[] args) {
        System.out.print("Ievadam ciparu : ");
        Scanner scanner = new Scanner(System.in);
        int dati = scanner.nextInt();
        scanner.close();
        if (dati % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}