import java.util.ArrayList;

public class Game {
	private String Name;
	private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<String> eventLog;

   
    public Game() {
        this.player = new Player(); 
        this.enemies = new ArrayList<Enemy>(); 
        this.eventLog = new ArrayList<String>(); 
    }

    // Getter za igrača
    public Player getPlayer() {
        return player;
    }
    // Getter za neprijatelje
    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    // Getter za dnevnik događaja
    public ArrayList<String> getEventLog() {
        return eventLog;
    }

  
    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
        eventLog.add("Dodali ste neprijatelja: " + enemy.getName());
    }
   
    public void logEvent(String event) {
        eventLog.add(event);
    }

       
    }



