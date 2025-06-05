package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public interface KamersQuestions {

        void setKamerquestions();
        int getQuestionCount();
        void getKamerquestions(int x);


}
class Kamer1Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer1: Wat voor app/website is handig om te gebruiken voor SCRUM?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}

//---------------------------------------------------------------------------------
class Kamer2Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer2: Waar staat DoR voor?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}

//---------------------------------------------------------------------------------
class Kamer3Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer3: Waar staat DoD voor?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}

//---------------------------------------------------------------------------------
class Kamer4Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer4: Wat is het nut van Scrum-master?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}

//---------------------------------------------------------------------------------
class Kamer5Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer5: Wat is een Sprint");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}

//---------------------------------------------------------------------------------
class Kamer6Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer6: Wat zijn User-stories");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}

//---------------------------------------------------------------------------------
class Kamer7Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer7: Waar bestaat het Acceptatiecriteria uit?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}

//---------------------------------------------------------------------------------
class Kamer8Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer8: Wat is een Backlog?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}

//---------------------------------------------------------------------------------
class Kamer9Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer9: Hoe meet je success van gedeelde Scrum-samenwerking?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}

//---------------------------------------------------------------------------------
class Kamer10Questions implements KamersQuestions{
    private final ArrayList<String> kamerquestions= new ArrayList<>();

    public void setKamerquestions() {
        kamerquestions.add("Kamer10: Wat is een risico bij één gedeelde Product Owner voor meerdere teams?");
    }

    public int getQuestionCount() {
        return kamerquestions.size();
    }

    public void getKamerquestions(int x) {
        System.out.println(kamerquestions.get(x));
    }
}
class MultipleChoiceAnswers{
    public void MultipleChoice(int x) {
        String[] subquestions = {"A-Trello \n" +"B-Amazon\n" + "C-Epic Games\n" + "D-Spotify"
                ,"A- Definition of Ready   \n" + "B- Degree of Refinement\n" + "C- Delivery of Results\n" + "D- Definition of Review"
                ,"A- Design of Delivery\n" + "B- Description of Development\n" + "C- Definition of Done    \n" + "D- Document of Decisions"
                ,"A- Het faciliteren van het Scrum-proces en het wegnemen van obstakels voor het team.               \n" + "B- Het goedkeuren van code voordat deze wordt gedeployed.\n" + "C- Het schrijven van alle user stories en technische documentatie.\n" + "D- Het managen van het team als een traditionele projectmanager."
                ,"A- Een vergaderweek waarin alleen wordt gepland en geevalueerd.\n" + "B- Een race om zoveel mogelijk erk te doen zonder pauzes.\n" + "C- Een moment waarop het team feedback verzamelt van de klant.\n"  + "D- Een vast tijdsblok waarin een Scrum-team werkt aan het opleveren van een werkend product."
                ,"A- Technische specificities die door developers worden geschreven.\n" + "B- Verslagen van wat het team dagelijks heft gedaan.\n" + "C- Korte beschrijvingen van functionaliteit vanuit het perspectief van de eindgebruiker. \n" + "D- Fictieve verhalen om het team te motiveren."
                ,"A- De planning van de Sprint.\n" + "B- De feedback van de klant tijdens de review.\n" + "C- De technische documentatie van het ontwikkelteam.\n" + "D- De voorwaarden waaraan een user-story moet voldoen om als 'klaar' te worden beschouwd."
                ,"A- Een verzameling van de sprintverslagen.\n" + "B- Een document met alle fouten in de software.\n" + "C- Een geordende lijst met taken, features, en verbeteringen die het team moet uitvoeren. \n"  + "D- Een lijst met contactpersonen van de klant."
                ,"A- Aantal sprints zoned incidenten.\n" + "B- Productiviteit per indvidu.\n" + "C- Regelmatige feedback, samenwerkingseffectiviteit en klantwaarde.             \n" + "D- Hoeveel taken er worden afgerond per dag."
                ,"A. Te veel focus op één team\n" + "B. Geen risico’s; dit werkt altijd goed\n" + "C. Vertraging in beslissingen door overbelasting goed\n" + "D. Teams worden volledig autonoom"};

        System.out.println(subquestions[x]);
    }
}

class ControlKamers{
    KamersQuestions object;

    ControlKamers(KamersQuestions x){
        this.object=x;
    }
}


