public class Character {
    String name;
    int hp;
    int power;
    public Character(String name,int hp,int power){
        this.name = name;
        this.hp = hp;
        this.power = power;
    }
    void attack(){

    }
    boolean isDead(){
        if(this.hp <= 0) {
            return true;
        }
        return false;
    }
}
