package com.rcs.classwork.Day6;

import java.util.Scanner;

public class WeirdOrNot {
    public static void main(String[] args) {
        System.out.print("Ievadam veselu skaitli : ");
        Scanner scanner = new Scanner(System.in);
        int dati = scanner.nextInt();
         if (dati >= 6 && dati <= 20) {
             System.out.println("Dīvaini");
         } else if (dati >= 2 && dati <= 5) {
             System.out.println("Nav dīvaini");
         } else if (!(dati % 2 == 0)) {
             System.out.println("Dīvaini");
         }else {
             System.out.println("Dīvaini");
        }
    }
}

