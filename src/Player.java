import java.util.Random;

public class Player extends Character{
    int level;
    int mp;
    String magic_list[];
    public Player(String name,int hp,int power,int level,int mp){
        super(name,hp,power);
        this.level = level;
        this.mp = mp;
        this.magic_list = new String[]{"メラ","イオナズン","ザキ"};
    }
    void magical(){

    }
    void setName(String name){
        this.name = name;
    }
    void setPower(){
        this.power = this.level * this.power;
    }
    void setHP(){
        this.hp = this.level * this.hp;
    }
    boolean run_away(){
        Random random = new Random();
        int randomValue = random.nextInt(10);
        System.out.println(randomValue);
        int RUN_PROBABILITY = 7;
        if(randomValue >= RUN_PROBABILITY){
            return false;
        }
        else return true;
    }
}
