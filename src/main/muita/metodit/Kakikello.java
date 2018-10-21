package main.muita.metodit;

import java.util.Scanner;

public class Kakikello {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Monta kertaa käkikello soi? ");
        int kello = input.nextInt();
        kukkuu(kello);
    }

    public static void kukkuu(int lkm){
        for (int i = 1; i <= lkm; i++) {
            System.out.println("Kukkuu");
        }
    }
}
