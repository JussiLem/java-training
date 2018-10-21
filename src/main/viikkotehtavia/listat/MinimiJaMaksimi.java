package main.viikkotehtavia.listat;

import java.util.*;

/**
 *Tallenna alla esitetty tehtäväpohja itsellesi tiedostoon MinimiJaMaksimi.java.
 * Tehtäväsi on jatkokehittää koodia siten, että lukujen kysymisen jälkeen ohjelmasi
 * käy läpi listan käyttäjän antamista luvuista ja etsii listalta pienimmän ja suurimman luvun.
 * Aseta pienin ja suurin löytynyt luku min ja max -nimisiin muuttujiin.
 Vinkki: käy listan arvot toistorakenteessa läpi ja
 vertaile vuorollaan jokaista arvoa siihen asti löytyneisiin pienimpään
 ja suurimpaan arvoon. Mikäli arvo on suurempi tai pienempi kuin aikaisemmat ääriarvot,
 aseta uusi ääriarvo muuttujaan talteen  min tai max -muuttujaan ja jatka listan läpikäyntiä.
 */

public class MinimiJaMaksimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Syötä luku " + i + "/5: ");
            luvut.add(lukija.nextInt());
        }

        // Kirjoita koodisi tähän
        List<Integer> max = Collections.singletonList(luvut
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new));
        List<Integer> min = Collections.singletonList(luvut
                .stream()
                .mapToInt(v -> v)
                .min().orElseThrow(NoSuchElementException::new));
        System.out.println();
        System.out.println("Pienin luku on: " + min);
        System.out.println("Suurin luku on: " + max);

        lukija.close();
    }

}