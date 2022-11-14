package Bitwise;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println(Isodd(n));
        if((n & 1)==1) {
        	System.out.println("odd number");
        }
        else {
        	System.out.println("even number");
        }
	}

	public static boolean Isodd(int n) {
		// TODO Auto-generated method stub
		return (n & 1)==1;
	}

}
