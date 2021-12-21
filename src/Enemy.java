public class Enemy extends Character{
    int experience;

    public Enemy(String name,int hp,int power,int experience){
        super(name,hp,power);
        this.experience = experience;
    }

}
