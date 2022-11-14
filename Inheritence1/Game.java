package Inheritence1;
import java.util.Scanner;
public class Game {
	static String gamename="PUBG";
 public Weapon pressbutton() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the score");
	 int score=sc.nextInt();
	 if(score<=400) {
		 return new Knief();
	 }
	 else if(score>400 && score<=1000) {
		 return new Gun();
	 }
	 else {
		 return new Bomb();
	 }
 }
}
