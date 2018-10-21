package main.viikkotehtavia.periytyminen;

public class Henkilo {

    public String getEtunimi() {
        return etunimi;
    }

    public String getOsoite() {
        return osoite;
    }

    @Override
    public String toString() {
        return etunimi + "\n" + osoite;
    }

    private String etunimi;
    private String osoite;

    public Henkilo(String etunimi, String osoite) {
        this.etunimi = etunimi;
        this.osoite = osoite;
    }
}
