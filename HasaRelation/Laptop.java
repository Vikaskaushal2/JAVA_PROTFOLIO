package HasaRelation;

public class Laptop {
String companyname;
double price;
Processor p1=new Processor("Octa core",50,2000.0);
Laptop(){
	
}
Laptop(String companyname,double price){
	this.companyname=companyname;
	this.price=price;
}
public void displaylaptop() {
	System.out.println("");
}
}
