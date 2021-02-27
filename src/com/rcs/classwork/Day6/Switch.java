package com.rcs.classwork.Day6;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Ievadam decimālskaitli a: ");
        Scanner scanner = new Scanner(System.in);
        float dati = scanner.nextFloat();
        System.out.print("Ievadam decimālskaitli b: ");
        float dati2 = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Ievadam darbību (+, -,*,/): ");
        String action = scanner.nextLine();
        System.out.println(action);
        scanner.close();
        switch (action) {
            case "+":
                System.out.println(dati + dati2);
                break;
            case "-":
                System.out.println(dati - dati2);
                break;
            case "*":
                System.out.println(dati * dati2);
                break;
            case "/":
                System.out.println(dati / dati2);
                break;
            default:
                System.out.println("Kaut kas nepareiz");

        }
    }
}
