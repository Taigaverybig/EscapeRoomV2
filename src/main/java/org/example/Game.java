package org.example;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) {

        AntwoordChecker checker = new AntwoordChecker();

        checker.addObserver(new Deur());
        checker.addObserver(new StatusDisplay());

        System.out.println("Speler antwoordt: correct");
        checker.controleerAntwoord("correct");

        System.out.println("\nSpeler antwoordt: fout");
        checker.controleerAntwoord("fout");

        int Counter=0;
        Scanner scanner= new Scanner(System.in);

        ControlKamers kamers1= new ControlKamers(new Kamer1Questions());
        ControlKamers kamers2= new ControlKamers(new Kamer2Questions());
        ControlKamers kamers3= new ControlKamers(new Kamer3Questions());
        ControlKamers kamers4= new ControlKamers(new Kamer4Questions());
        ControlKamers kamers5= new ControlKamers(new Kamer5Questions());
        ControlKamers kamers6= new ControlKamers(new Kamer6Questions());
        ControlKamers kamers7= new ControlKamers(new Kamer7Questions());
        ControlKamers kamers8= new ControlKamers(new Kamer8Questions());
        ControlKamers kamers9= new ControlKamers(new Kamer9Questions());
        ControlKamers kamers10= new ControlKamers(new Kamer10Questions());

        kamers1.object.setKamerquestions();
        kamers2.object.setKamerquestions();
        kamers3.object.setKamerquestions();
        kamers4.object.setKamerquestions();
        kamers5.object.setKamerquestions();
        kamers6.object.setKamerquestions();
        kamers7.object.setKamerquestions();
        kamers8.object.setKamerquestions();
        kamers9.object.setKamerquestions();
        kamers10.object.setKamerquestions();

        MultipleChoiceAnswers answers= new MultipleChoiceAnswers();
        CheckAnswers checkers= new CheckAnswers();
        checkers.checkIt();

        //kamer1
        for(int i=0;i<kamers1.object.getQuestionCount();i++) {
            kamers1.object.getKamerquestions(i);
            answers.MultipleChoice(Counter);
            String text= scanner.nextLine();
            checkers.sendCorrectionMessage(Counter, text);
            Counter++;
        }
        System.out.println();

        //kamer2
        for(int i=0;i<kamers2.object.getQuestionCount();i++) {
            kamers2.object.getKamerquestions(i);
            answers.MultipleChoice(Counter);
            String text= scanner.nextLine();
            checkers.sendCorrectionMessage(Counter, text);
            Counter++;
        }
        System.out.println();

        //kamer3
        for(int i=0;i<kamers3.object.getQuestionCount();i++) {
            kamers3.object.getKamerquestions(i);
            answers.MultipleChoice(Counter);
            String text= scanner.nextLine();
            checkers.sendCorrectionMessage(Counter, text);
            Counter++;
        }
        System.out.println();

        //kamer4
        for(int i=0;i<kamers4.object.getQuestionCount();i++) {
            kamers4.object.getKamerquestions(i);
            answers.MultipleChoice(Counter);
            String text= scanner.nextLine();
            checkers.sendCorrectionMessage(Counter, text);
            Counter++;
        }
        System.out.println();

        //kamer5
        for(int i=0;i<kamers5.object.getQuestionCount();i++) {
            kamers5.object.getKamerquestions(i);
            answers.MultipleChoice(Counter);
            String text= scanner.nextLine();
            checkers.sendCorrectionMessage(Counter, text);
            Counter++;
        }
        System.out.println();

        //kamer6
        for(int i=0;i<kamers6.object.getQuestionCount();i++) {
            kamers6.object.getKamerquestions(i);
            answers.MultipleChoice(Counter);
            String text= scanner.nextLine();
            checkers.sendCorrectionMessage(Counter, text);
            Counter++;
        }
        System.out.println();

        //kamer7
        for(int i=0;i<kamers7.object.getQuestionCount();i++) {
            kamers7.object.getKamerquestions(i);
            answers.MultipleChoice(Counter);
            String text= scanner.nextLine();
            checkers.sendCorrectionMessage(Counter, text);
            Counter++;
        }
        System.out.println();

        //kamer8
        for(int i=0;i<kamers8.object.getQuestionCount();i++) {
            kamers8.object.getKamerquestions(i);
            answers.MultipleChoice(Counter);
            String text= scanner.nextLine();
            checkers.sendCorrectionMessage(Counter, text);
            Counter++;
        }
        System.out.println();

        //kamer9
        for(int i=0;i<kamers9.object.getQuestionCount();i++) {
            kamers9.object.getKamerquestions(i);
            answers.MultipleChoice(Counter);
            String text= scanner.nextLine();
            checkers.sendCorrectionMessage(Counter, text);
            Counter++;
        }
        System.out.println();

        //kamer10
        for(int i=0;i<kamers10.object.getQuestionCount();i++) {
            kamers10.object.getKamerquestions(i);
            answers.MultipleChoice(Counter);
            String text= scanner.nextLine();
            checkers.sendCorrectionMessage(Counter, text);
            Counter++;
        }
    }
}
