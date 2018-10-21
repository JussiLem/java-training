package main.viikkotehtavia.metodit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Tässä tehtävässä sinun tulee kirjoittaa apuluokka Leikkaus.
 * Leikkaus-luokassa on oltava laskeLeikkaus-niminen metodi täsmälleen seuraavan kuvauksen mukaisena:
 */
public class Leikkaus {
    /**
     * Kirjoita myös main-metodi, jossa kokeilet haluamallasi tavalla, että kirjoittamasi koodi toimii oikein.
     * Tässä tehtävässä main-metodisi saa tulostaa mitä tahansa.
     * Tehtävän tarkastus ei perustu kirjoittamaasi main-metodiin, vaan erilliseen valmiiksi kirjoitettuun testiluokkaan.
     */

    public static void main(String[] args) {

        List<Integer> listaA = Arrays.asList(-70, 120, 98, 1, 789);
        List<Integer> listaB = Arrays.asList(98, 42, 5, 1, -70);
        List<Integer> leikkaus = laskeLeikkaus(listaA, listaB);
        System.out.println("Listojen A ja B leikkaus: " + leikkaus);
    }

    /**
     * metodi on julkinen
     * metodi on staattinen eli luokkametodi
     * metodi palauttaa uuden listan, joka on tyyppiä List<Integer>
     * metodi saa parametriarvoinaan kaksi kokonaislukulistaa (List<Integer>)
     * metodi palauttaa leikkauksen kahdesta annetusta listasta, eli sellaisen listan,
     * joka sisältää kaikki sellaiset luvut, jotka ovat molemmissa parametriarvoina saaduissa listoissa
     * kukin luku saa esiintyä leikkauksessa korkeintaan kerran
     * leikkauksen lukujen järjestyksellä ei ole merkitystä.
     */

    public static List<Integer> laskeLeikkaus(List<Integer> lista1, List<Integer> lista2) {
        return lista1.stream().filter(lista2::contains).collect(Collectors.toList());
    }
}
