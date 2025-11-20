package udg.edu.me;

public class Player extends GameObject{

	private String name;
	private int health;
	
	public Player(int x, int y, Collidable reference, String name, int health) {
		super(x, y, reference);
		this.name = name;
		this.health = health;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		  if (name == null) {
	            throw new IllegalArgumentException("Ime ne smije biti null.");
	        }
	}
     
     public int getHealth() {
 		return health;
 	}

 	public void setHealth(int health) {
 		 if (health < 0 || health > 100) {
             throw new IllegalArgumentException("Health mora biti u opsegu 0-100.");
         }
 	
 		this.health = health;
 		
 	}
 	 @Override
     public String getDisplayName() {
         return name;
     }

}
