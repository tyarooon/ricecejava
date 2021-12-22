public class Character {
    String name;
    int hp;
    int power;
    int experience;
    public Character(String name,int hp,int power,int experience){
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.experience = experience;
    }
    void attack(Character character){
        character.hp -= this.power;
    }
    boolean isDead(){
        if(this.hp <= 0) {
            return true;
        }
        return false;
    }
}
