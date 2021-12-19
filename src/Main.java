public class Main {

    public static void main(String[] args) {
	    Character character = new Character("tarou",0,30);
        System.out.println(character.isDead());
        Player player = new Player("tarou",0,30,1,10);
//        player.run_away();
        System.out.println(player.run_away());
    }
}