package main.viikkotehtavia.periytyminen;

import java.util.ArrayList;
import java.util.List;

public class HenkiloTulostus {

    public static void main(String[] args) {
        List<Henkilo> henkilot = new ArrayList<Henkilo>();
        henkilot.add(new Henkilo("Ada Lovelace", "Korsontie 1 03100 Vantaa"));
        henkilot.add(new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki"));

        tulostaHenkilot(henkilot);
    }

    public static void tulostaHenkilot(List<Henkilo> henkilot) {
        // Printtaa listan nimet
        for(Henkilo henkilo : henkilot) {
            System.out.println(henkilo.getEtunimi() + "\n" + henkilo.getOsoite());
        }
    }
}