import org.example.Player;

public class MiniMonster implements Monster{

    public   void increasePower(){

  }
    public void attack(Player player){
        System.out.println("De mini monster valt je aan");
        player.decreaseHP(1);
    }
}
