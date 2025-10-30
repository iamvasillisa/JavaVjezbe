
public class Player extends GameObject {

private String ime;
private int health;

//Konstruktor

public  Player(String ime, int x, int y, int width, int height, int health)  {
	this.ime = ime;
	this.health = health;
}	
	@Override 
	public String toString() {
		return String.format("Player[ime=%s],@ (%d, %d), %dx%d, HP=%d", ime,x,y,width,height,health);

	
if (health >= 0 && health <= 100) {
		
	}else {
	System.out.println("Health mora biti izmedju 0 i 100.");
	
	
	
	
	
	
}}}
