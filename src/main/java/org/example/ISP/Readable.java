package org.example.ISP;

public interface Readable {
    void showMessage();
}

interface Weapon {
    void attack();

}
class Kamerinfo implements Readable {
    private String info;

    public Kamerinfo(String info) {
        this.info = info;
    }

    @Override
    public void showMessage() {
        System.out.println("Kamerinfo: " + info);
    }
}

class Zwaard implements Weapon {
    private String naam = "QuestionSlayer";
    private int dmg = 10;

    @Override
    public void attack() {
        System.out.println(naam + " wordt gebruikt om het monster aan te vallen!");
        System.out.println("Damage dealt: " + dmg);
    }
}
