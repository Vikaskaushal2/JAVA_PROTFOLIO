package basic_Opps;

public class Fruit {
	String name;
	double price;
	String type;
	public static void eat() {
		 System.out.println("eat the whole part");
	}
	public void roll() {
		 System.out.println(" it can roll ");
	}

	public static void main(String[] args) {
		
		Fruit f1=new Fruit();
	    System.out.println(	f1.name="mango");
		f1.price=120.0;
		System.out.println(f1.price);
		f1.roll();
		eat();

	}

}
