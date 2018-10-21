package main.viikkotehtavia.poikkeukset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summaaja {
  public static void main(String[] args) throws IOException {
    String input;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int luku = 0;
    int summa = 0;
    // Syötä seuraava luku (0 lopettaa)

    do {
      try {
        System.out.print("Syötä seuraava luku(0 lopettaa): ");
        input = reader.readLine();
        luku = Integer.parseInt(input);
        summa = summa + luku;

      } catch (RuntimeException e) {
        System.out.println("Virheellinen syöte!");
      }

    } while (luku != 0);
      System.out.println("Lukujen summa on " + summa + ".");
  }
}
