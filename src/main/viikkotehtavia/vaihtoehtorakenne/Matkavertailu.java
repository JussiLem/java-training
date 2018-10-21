package main.viikkotehtavia.vaihtoehtorakenne;

import java.util.Scanner;

public class Matkavertailu {

    public static void main(String[] args) {
        int kuukausi;
        double yksiLippu;
        double kuukausiLippu;
        Scanner lukija = new Scanner(System.in);

        System.out.print("Montako matkaa teet kuukaudessa: ");
        kuukausi = lukija.nextInt();

        System.out.print("Anna yksittäisen lipun hinta: ");
        yksiLippu = lukija.nextDouble();

        System.out.print("Anna kuukausilipun hinta: ");
        kuukausiLippu = lukija.nextDouble();

        double yksittainenYhteensa = yksiLippu * kuukausi;
        double erotus1 = (kuukausiLippu - yksittainenYhteensa);
        if (yksittainenYhteensa < kuukausiLippu) {
            System.out.printf("Yksittäinen on %.2f euroa halvempi kuin kuukausilippu", erotus1);
        } if (kuukausiLippu < yksittainenYhteensa) {
            double erotus2 = yksittainenYhteensa - kuukausiLippu;
            System.out.printf("Kuukausilippu on %.2f euroa halvempi kuin yksittäinen", erotus2);
        } else if(yksittainenYhteensa == kuukausiLippu) {
            System.out.print("Liput ovat samanhintaiset");
        }
    }
}
