package udg.edu.me;

public abstract class GameObject  {

	private float x;
    private float y;
    private Collidable collider;
	
	
	public GameObject(int x, int y, Collidable reference) {
		this.x = x;
		this.y = y;
		this.collider = collider;
			
	}

    
    public float getX() {
        return x;
    }

    public void setX(float x) {
        if (x < 0) {
           
            throw new IllegalArgumentException("X pozicija ne smije biti negativna.");
        }
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        if (y < 0) {
           
            throw new IllegalArgumentException("Y pozicija ne smije biti negativna.");
        }
        this.y = y;
    }

    public Collidable getCollider() {
        return collider;
    }
    
    public void setCollider(Collidable collider) {
        if (collider == null) {
            throw new IllegalArgumentException("Collidable objekat ne smije biti null.");
        }
        this.collider = collider;
    }


	@Override
	public String toString() {
		return "GameObject [x=" + x + ", y=" + y + ", collider=" + collider + "]";
	}


	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
