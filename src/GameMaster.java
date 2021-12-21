public class GameMaster {
    //ゲームスタート時
    void start(){
    }
    void encounterEnemy(String enemyName){
        System.out.println(enemyName+"があらわれた！");
    }
    void killMessage(String enemyName){
        System.out.println(enemyName+"をたおした！");
    }
    boolean currentInput(){
        return false;
    }
    void playerTurn(){
    }
    void enemyTurn(){
    }
    void levelUp(Player player,int experience){

    }
}
