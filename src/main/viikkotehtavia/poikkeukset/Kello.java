package main.viikkotehtavia.poikkeukset;

public class Kello {
  // yksityiset oliomuuttujat tunnit (int) ja minuutit (int)
  private int tunnit;
  private int minuutit;

  // konstruktori Kello(int tunnit, int minuutit)
  // tunnit ovat väliltä 0 ≤ tunnit ≤ 23.
  public Kello(int tunnit, int minuutit) throws VirheellinenAikaPoikkeus {
    if (tunnit < 0 || tunnit > 23) {
      throw new VirheellinenAikaPoikkeus("Tunnit pielessä!");
    } else {
      this.tunnit = tunnit;
    }
    if (minuutit < 0 || minuutit > 59) {
      throw new VirheellinenAikaPoikkeus("Minuutit pielessä!");
    } else {
      this.minuutit = minuutit;
    }
  }

  public static void main(String[] args) {
    Kello a1 = new Kello(22, 12);
    // Kello a2 = new Kello(0, 06);
    System.out.println(a1.toString());
    a1.lisaaMinuutit(40);
    System.out.println(a1.toString());
    a1.lisaaMinuutit(29);
    System.out.println(a1.toString());
    a1.lisaaMinuutit(45);
    System.out.println(a1.toString());

    // System.out.println(a2);
  }

  // public void lisaaMinuutit(int mins) -metodi, joka kasvattaa kellonaikaa annettujen minuuttien
  // verran.
  public void lisaaMinuutit(int mins) {
    if (mins < 0) {
      throw new VirheellinenAikaPoikkeus("Minuutit negatiivisia");
    } else {
      int yhteensaMinuutit = 60 * tunnit + minuutit + mins;


      if (tunnit > 23) {
          tunnit = yhteensaMinuutit % tunnit;
      } else {
          tunnit = yhteensaMinuutit / 60;
      }
      if (minuutit > 59) {
          minuutit = yhteensaMinuutit % minuutit ;
      } else {
          minuutit = yhteensaMinuutit % 60;
      }


    }
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d", this.tunnit, this.minuutit);
  }

  public int getMinuutit() {
    return minuutit;
  }
  // minuutit väliltä 0 ≤ minuutit ≤ 59
  public void setMinuutit(int minuutit) {
    if (minuutit < 0 || minuutit > 59) {
      throw new VirheellinenAikaPoikkeus("Virheelliset minuutit");
    } else {
      this.minuutit = minuutit;
    }
  }

  public int getTunnit() {
    return tunnit;
  }

  // annetut tunnit ovat väliltä 0 ≤ tunnit ≤ 23.
  public void setTunnit(int tunnit) {
    if (tunnit < 0 || tunnit > 23) {
      throw new VirheellinenAikaPoikkeus("Virheelliset tunnit");
    } else {
      this.tunnit = tunnit;
    }
  }
}
