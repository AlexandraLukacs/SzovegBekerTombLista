package hu.szamalk;

import java.util.ArrayList;
import java.util.Arrays;

public class Szoveg {
    private String bekert;
    private String[] tomb;
    private ArrayList<Character> lista;

    public Szoveg(String bekert) {
        if (bekert.length() <= 15 || egyediKarakterekSzama(bekert) < 5) {
            System.out.println("A szöveg legalább 15 karakter hosszú és legalább 5 különböző betűt kell tartalmazzon!");
        }
        this.bekert = bekert;
        this.tomb = bekert.split("");
        this.lista = new ArrayList<>();
    }

    private int egyediKarakterekSzama(String szoveg){
        return (int) szoveg.chars().distinct().count();
    }

    public String tombVesszo() {
        return String.join(",", tomb);
    }

    public String listaKotojel() {
        return String.join( "-",  lista);
    }

}
