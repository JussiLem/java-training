package main.viikkotehtavia.periytyminen;

public class Taksi extends Auto {

    private String taksinumero;

    public Taksi(String valmistaja, String rekisterinumero, String numero) {
        super(valmistaja, rekisterinumero);
        this.taksinumero = numero;
    }

    public String getTaksinumero() {
        return taksinumero;
    }
}
