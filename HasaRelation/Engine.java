package HasaRelation;

public class Engine {
    int hp;
    int stroke;
    String type;
    Engine(){
    	
    }
    Engine(int hp,int stroke,String type){
    	this.hp=hp;
    	this.stroke=stroke;
    	this.type=type;
    	
    }
    public void start() {
     System.out.println("engine start");
    	
    }
    public void displayengine() {
    	System.out.println("engine horepower is: "+hp);
    	System.out.println("engine strke is: "+stroke);
    	System.out.println("engine type is :"+type);
    }
}
