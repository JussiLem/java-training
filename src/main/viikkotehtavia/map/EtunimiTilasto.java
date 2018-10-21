package main.viikkotehtavia.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tässä tehtävässä sinun tulee hyödyntää Väestörekisterikeskuksen julkaisemaa etunimitilastoa ja kirjoittaa ohjelma,
 * joka kertoo käyttäjälle kuinka monta kunkin nimistä Suomen kansalaista on väestötietojärjestelmässä.
 */
public class EtunimiTilasto {
    /* Main-metodissa sinun tulee lukea etunimitilaston sisältävä tiedosto ja
    muodostaa sen sisällön perustella Map<String, Integer> -tyyppinen kokoelma,
    johon laitat talteen kunkin etunimen ja sitä vastaavan lukumäärän. */
    private Map<String, Integer> etunimitilasto = new HashMap<>();

    TiedostonLukija lukija = new TiedostonLukija("etunimet.csv");
    List<String> rivit = lukija.lueRivit();

    public Map<String, Integer> getEtunimitilasto() {

        return etunimitilasto;
    }
}
