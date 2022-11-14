package HasaRelation;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car c1=new Car("Maruti",500000);
       Car c2=new Car("honda",120000);
       c1.displaycar();
       System.out.println("==============");
       c2.displaycar();
       System.out.println("==============");
       System.out.println(c1.price);
       c1.start();
       c1.e.start();
	}

}
