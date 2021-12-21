public class Main {

    public static void main(String[] args) {
	    Character character = new Character("tarou",100,30);
        Character character2 = new Character("zirou",100,50);
        Player player = new Player("tarou",0,30,1,10);
        Enemy enemy = new Enemy("a",1000,5,1);
        System.out.println(player.run_away());
        character.attack(character2);
        character2.attack(character);
        player.attack(enemy);
        System.out.println(enemy.hp);

        //run();

    }

    static void run(){
        GameMaster master = new GameMaster();
        Player brave = new Player("a",1,1,1,1);
        Enemy slime = new Enemy("スライム",1,1,1);

        master.start();
        Enemy enemyList[] = {slime};
        for(Enemy enemy:  enemyList){
            master.encounterEnemy(enemy.name);
            while(!brave.isDead() && !enemy.isDead()){
                master.playerTurn();
                master.enemyTurn();
            }
            if(brave.isDead()){
                System.out.println("GameOver");
                break;
            }
            master.levelUp(brave,enemy.experience);
        }

    }
}