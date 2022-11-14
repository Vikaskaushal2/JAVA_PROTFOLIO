package basic_Opps;

public class laptop {
   String brand;
   int price;
    int ram;
    public void multitasking() {
    	System.out.println("it can do multitasking");
    }
    public void multimedia() {
    	System.out.println("it supports multimedia");
    }
    public void setvalue( String n,int p,int r ) {
    	brand=n;
    	price=p;
    	ram=r;
    	
    	
    }
    public void display() {
    	System.out.println("brand is"+brand);
    	System.out.println("price is"+price);
    	System.out.println("ram of laptop"+ram);
    	
    }
	
       
	} 


