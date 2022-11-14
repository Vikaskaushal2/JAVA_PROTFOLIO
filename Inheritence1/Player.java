package Inheritence1;

public class Player {
	static String playername="vikas kaushal";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Game g=new Game();
        System.out.println(g.gamename);
        System.out.println(playername);
        Weapon w=g.pressbutton();
        w.use();
	}

}
