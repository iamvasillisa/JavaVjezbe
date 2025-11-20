package udg.edu.me;

public abstract class RectangleCollider implements Collidable1 {

	


	    private int x;
	    private int y;
	    private int width;
	    private int height;

	    public RectangleCollider(int x, int y, int width, int height) {
	        if (width <= 0 || height <= 0) {
	            throw new IllegalArgumentException("Dimenzije pravougaonika moraju biti veće od nule.");
	        }
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public int getHeight() {
	        return height;
	    }

		@Override
		public String toString() {
			return "RectangleCollider [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
		}
	    
	    
}