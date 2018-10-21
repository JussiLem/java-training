package main.viikkotehtavia.periytyminen;

public class Opiskelija extends Henkilo {

    private int opintopisteita;


    public Opiskelija(String etunimi, String osoite) {
        super(etunimi, osoite);
    }

    @Override
    public String toString() {
        return getEtunimi() + "\n" + getOsoite() +
                "\n" + "opintopisteitä " + opintopisteita ;
    }

    public int opintopisteita() {
        return opintopisteita;
    }

    public void opiskele() {
        opintopisteita = opintopisteita + 1;
    }
}
