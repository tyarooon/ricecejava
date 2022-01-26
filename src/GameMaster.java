import java.util.Scanner;

public class GameMaster {
    //ゲームスタート時
    void start(Player player){
        System.out.println("名前を入力してください");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        player.setName(name);
        System.out.println(name+"は魔王を倒す旅に出た！");
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
    void playerTurn(Player player,Enemy enemy){
        System.out.println(player.name+"のターン");
        System.out.println("コマンドを入力してください。");
        System.out.println("1:たたかう 2:魔法("+player.mp+")3:逃げる");
        Scanner sc = new Scanner(System.in);
        int commandNumber = sc.nextInt();
        if(commandNumber == 1){
            System.out.println(player.name+"はたたかうことにした。");
            System.out.println(enemy.name+"に"+player.power+"ダメージ。");
            player.attack(enemy);
        }
        if(commandNumber == 3){
            System.out.println(player.name+"は逃げた！！");
            if(player.run_away()){
                System.out.println("うまく逃げ切れたようだ。");
                enemy.hp = 0;
            }
            else{
                System.out.println("逃げきれなかった。");
            }
        }
    }

    void enemyTurn(Player player,Enemy enemy){
        System.out.println(enemy.name+"のターン");
        enemy.attack(player);
        System.out.println(player.name+"に"+enemy.power+"ダメージ。");
    }

    void levelUp(Player player,Enemy enemy){
        player.experience += enemy.experience;
        int ToUplevel = 5 * player.level;
        if(player.experience >= ToUplevel){
            player.level += 1;
        }
    }
}
