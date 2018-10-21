package main.muita.metodit;

public class Laskuri2 {
    public static void main(String[] args) {
        int z;
        int x = 10;
        int n = 20;

        z = summa(5);
        System.out.println(z);
        z = summa(x);
        System.out.println(z);
    }

    public static int summa(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
