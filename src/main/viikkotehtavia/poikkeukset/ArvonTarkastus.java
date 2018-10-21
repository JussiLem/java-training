package main.viikkotehtavia.poikkeukset;

import java.util.Scanner;

public class ArvonTarkastus {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Syötä luku väliltä 0-23: ");
    int kokonaisluku = input.nextInt();
    if (kokonaisluku < 0 || kokonaisluku > 23) {
      throw new IllegalArgumentException();
    } else {
      System.out.println("Luku " + kokonaisluku + " on sallittu.");
    }
  }
}
