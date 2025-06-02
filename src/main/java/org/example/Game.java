package org.example;



public class Game {
    public static void main(String[] args) {

        AntwoordChecker checker = new AntwoordChecker();

        checker.addObserver(new Deur());
        checker.addObserver(new StatusDisplay());

        System.out.println("Speler antwoordt: correct");
        checker.controleerAntwoord("correct");

        System.out.println("\nSpeler antwoordt: fout");
        checker.controleerAntwoord("fout");
        }
}

