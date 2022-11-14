package interfaces;

public class Mycar {
 private Engine engine;
 private Media player=new Cdplayer();
public Mycar() {
	this.engine=new Powerengine();
}
public Mycar(Engine engine) {
	this.engine=engine;
}
public void stop() {
	engine.stop();
}
public void star() {
	engine.start();
}
public void acc() {
	engine.acc();
}
public void startmusic() {
	player.start();
}
public void stoptmusic() {
	player.stop();
	
}
public void upgradengine() {
	this.engine=new Electricengine();
}
}
