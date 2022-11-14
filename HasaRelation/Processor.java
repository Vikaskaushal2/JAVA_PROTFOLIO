package HasaRelation;

public class Processor{
  String name;
  int frequency;
  double price;
  Processor(){
	  
  }
  Processor(String name,int frequency,double price){
	  this.name=name;
	  this.frequency=frequency;
	  this.price=price;
  }
  public void Processorprop() {
	  System.out.println("name of processor"+name);
	  System.out.println("frequency of processor"+frequency);
	  System.out.println("price of processor"+price);
  }
  public void start() {
	  System.out.println("processor start");
  }
}
