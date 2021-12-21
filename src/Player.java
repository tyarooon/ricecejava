import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.HashMap;

public class Player extends Character{
    int level;
    int mp;
    HashMap<String, Integer> useMagic;

    //levelとmpは引数とらずに初期値を入れていいかも
    public Player(String name,int hp,int power,int level,int mp){
        super(name,hp,power);
        this.level = level;
        this.mp = mp;
        this.useMagic = new HashMap<String, Integer>();
        this.useMagic.put("メラ", 10);
        this.useMagic.put("イオナズン", 20);
        this.useMagic.put("ザキ", 100);
    }
    void magical(){
        System.out.println(this.useMagic.get("メラ"));
    }
    void setName(String name){
        this.name = name;
    }
    void updatePower(){
        this.power = this.level * this.power;
    }
    void updateHP(){
        this.hp = this.level * this.hp;
    }
    boolean run_away(){
        Random random = new Random();
        int RUN_PROBABILITY = 7;
        int randomValue = random.nextInt(10);
        System.out.println(randomValue);
        if(randomValue >= RUN_PROBABILITY){
            return false;
        }
        else return true;
    }

}
