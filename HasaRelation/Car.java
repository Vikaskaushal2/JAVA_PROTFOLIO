package HasaRelation;

public class Car {
     String name;
     double price;
     Engine e=new Engine(600,4, "petrol");
     Car(){
    	 
     }
     Car(String name,double price){
    	 this.name=name;
    	 this.price=price;
     }
     public void start() {
    	 System.out.println("car statrs......");
     }
     public void displaycar() {
    	 System.out.println("car name is"+name);
    	 System.out.println("car price is :"+price);
    	 e.displayengine();
     }
}
