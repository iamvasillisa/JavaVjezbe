
public class BossEnemy extends Enemy {

	private String type;
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	
	//Konstruktor
	
		public Enemy(String type, int x, int y , int width, int height,int damage)
			{
		this.type = type;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
		}
			//Getteri i setteri
			
			@Override
			public String toString() {
				return "BossEnemy [type=" + type + ", x=" + x + ", y=" + y + ", width=" + width + ", height=" + height
						+ ", damage=" + damage + "]";
			}
			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public int getX() {
				return x;
			}

			public void setX(int X) {
			   this.x = x;
			}
			 public int getY() {
			    return y;
			    }
			    
			 public void setY(int Y) {
			    this.y = y;
			 }
			    
			public int getWidth() {
				return width;
			}

			public void setWidth(int width) {
				this.width = width;
			}

			public int getHeight() {
				return height;
			}

			public void setHeight(int height) {
				this.height = height;
			}

			public int getDamage() {
				return damage;
			}

			public void setDamage(int damage) {
				this.damage = damage;
					
			
}

}
