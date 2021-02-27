package com.rcs.classwork.Day6;

import java.util.Scanner;

public class WeirdOrNot {
    public static void main(String[] args) {
        System.out.print("Ievadam veselu skaitli : ");
        Scanner scanner = new Scanner(System.in);
        int dati = scanner.nextInt();
        scanner.close();
        if (dati % 2 !=0 || (dati >=6 && dati <=20)) {
            System.out.println("Dīvaini");
        }else {
        System.out.println("Nav dīvaini");

        }
    }
}

