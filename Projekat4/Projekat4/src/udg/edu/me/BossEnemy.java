package udg.edu.me;

public abstract class BossEnemy extends Enemy {

    public BossEnemy(String type, int x, int y, Collidable collider, int damage, int health) {
        super(type, x, y, collider, damage, health);
    }
    
    //metoda getEffectiveDamage
    
    @Override
    public int getEffectiveDamage() {
        return getDamage() * 2;
    }
    
    protected abstract String getSizeDescription();
	 
    @Override
    public String toString() {
        return "BossEnemy[" + getDisplayName() + "] @(" + getX() + "," + getY() + ") " + getSizeDescription() + " DMG=" + getEffectiveDamage() + "x2" + " HP=" + getHealth();
    }


} 