public class Main {

    public static void main(String[] args) {
        Player player = new Player("tarou",0,30,0,1,10);
        Enemy enemy = new Enemy("a",1000,5,1);
        GameMaster gamemaster = new GameMaster();
        gamemaster.enemyTurn(player,enemy);
        //run();

    }

    static void run(){
        GameMaster master = new GameMaster();
        Player brave = new Player("a",1,1,0,1,10);
        Enemy slime = new Enemy("スライム",1,1,1);
        Enemy ouga = new Enemy("オーガ",10,10,10);

        master.start(brave);
        Enemy enemyList[] = {slime,ouga};
        for(Enemy enemy:  enemyList){
            master.encounterEnemy(enemy.name);
            while(!brave.isDead() && !enemy.isDead()){
                master.playerTurn(brave,enemy);
                master.enemyTurn(brave,enemy);
            }
            if(brave.isDead()){
                System.out.println("GameOver");
                break;
            }
            master.levelUp(brave,enemy);
        }

    }
}