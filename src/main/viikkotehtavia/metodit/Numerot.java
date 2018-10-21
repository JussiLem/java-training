package main.viikkotehtavia.metodit;

import java.util.Arrays;
import java.util.List;

public class Numerot {
    /**
     * Kirjoita myös main-metodi, jossa kokeilet haluamallasi tavalla, että kirjoittamasi metodit toimivat oikein.
     */
    public static void main(String[] args) {
        List<Integer> lukuja = Arrays.asList(98, 42, 5, 1, -70);
        int minimi = pienin(lukuja);
        System.out.println(minimi);
        int maksimi = suurin(lukuja);
        System.out.println(maksimi);
        int summa = summa(lukuja);
        System.out.println(summa);

    }

    public static int pienin(List<Integer> arvot) {
        Integer minNum = Integer.MAX_VALUE;
        for(Integer i :  arvot){
            if(i < minNum) {
                minNum = i;
            }
        }
        return minNum;
    }

    public static int suurin(List<Integer> arvot) {
        Integer maxValue = Integer.MIN_VALUE;
        for(Integer i : arvot) {
            if(i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static int summa(List<Integer> arvot) {
        return arvot.stream().mapToInt(Integer::intValue).sum();
    }
}
