package udg.edu.me;

public abstract  class Enemy extends GameObject implements Attacker {

    private String type;
    private int damage; // 0–100
    private int health; // 0–100

    public Enemy(String type, int x, int y, Collidable collider, int damage, int health) {
        super(x, y, collider);
        setType(type);
        setDamage(damage);
        setHealth(health);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Tip neprijatelja ne smije biti null.");
        }
        String trimmed = type.trim();
        if (trimmed.isEmpty()) {
            throw new IllegalArgumentException("Tip neprijatelja ne smije biti prazan.");
        }
        this.type = trimmed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage < 0 || damage > 100) {
            throw new IllegalArgumentException("Damage mora biti u opsegu 0-100.");
        }
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0 || health > 100) {
            throw new IllegalArgumentException("Health neprijatelja mora biti u opsegu 0-100.");
        }
        this.health = health;
    }
}