import org.example.Player;

public class MainBoss implements Monster{
    int power = 0;

    public   void increasePower(){

    }
    public void attack(Player player){
        System.out.println("De Main Boss valt je aan");
        player.decreaseHP(power);
    }
}
