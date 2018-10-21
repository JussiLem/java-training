package main.viikkotehtavia.periytyminen;

public class Auto {

    private String valmistaja;
    private String rekisterinumero;

    Auto(String valmistaja, String rekisterinumero) {
        this.valmistaja = valmistaja;
        this.rekisterinumero = rekisterinumero;
    }

    public String getValmistaja() {
        return valmistaja;
    }

    public String getRekisterinumero() {
        return rekisterinumero;
    }
}
