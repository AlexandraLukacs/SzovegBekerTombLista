package hu.szamalk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy szöveget (legalább 15 betű és 5 különböző betű): ");
        String beker = scanner.nextLine();

        Szoveg szoveg = new Szoveg(beker);
        System.out.println("tömb: ");
        szoveg.tombVesszo();
        System.out.println("lista: ");
        szoveg.listaKotojel();
    }
}