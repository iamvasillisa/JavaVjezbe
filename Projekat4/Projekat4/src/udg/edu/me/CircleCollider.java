package udg.edu.me;

public abstract class CircleCollider implements Collidable1 {

    private int centerX;
    private int centerY;
    private int radius;

    public CircleCollider(int centerX, int centerY, int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Poluprečnik mora biti veći od nule.");
        }
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public int getRadius() {
        return radius;
    }

	@Override
	public String toString() {
		return "CircleCollider [centerX=" + centerX + ", centerY=" + centerY + ", radius=" + radius + "]";
	}
}
   