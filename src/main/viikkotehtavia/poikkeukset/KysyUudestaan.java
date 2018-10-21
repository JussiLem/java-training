package main.viikkotehtavia.poikkeukset;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KysyUudestaan {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean jatkaLooppia = true;
    do {
      try {
        System.out.println("Syötä kokonaisluku: ");
        int kokonaisluku = input.nextInt();
        System.out.println("Syötit luvun " + kokonaisluku + ".");
        jatkaLooppia = false;
      } catch (InputMismatchException e) {
        input.nextLine();
        System.out.printf("Virheellinen luku!%n%n");
      } catch (ArithmeticException e) {
        System.out.printf("Virheellinen luku!%n%n");
      }
    } while (jatkaLooppia);
  }
}
