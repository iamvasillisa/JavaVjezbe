package udg.edu.me;

	import java.util.ArrayList;
	import java.util.List;

		public class Game {

			private Player player;
			private List<Enemy> enemies;
			private List<String> eventLog;

		public Game(Player player) {
			if (player == null) {
				throw new IllegalArgumentException("Player ne smije biti null.");
			}
			this.player = player;
			this.enemies = new ArrayList<>();
			this.eventLog = new ArrayList<>();
			
    }

		public Player getPlayer() {
			return player;
		}

		public void setPlayer(Player player) {
			this.player = player;
		}

		public List<Enemy> getEnemies() {
			return enemies;
		}

		public void setEnemies(List<Enemy> enemies) {
			this.enemies = enemies;
		}

		public List<String> getEventLog() {
			return eventLog;
		}

		public void setEventLog(List<String> eventLog) {
			this.eventLog = eventLog;
		}
		 public boolean checkCollision(Player p, Enemy e) {
		        if (p == null || e == null) {
		            throw new IllegalArgumentException("Player ili Enemy su null.");
		        }
		        return p.intersects(e);
		    }

		    public void decreaseHealth(Player p, Enemy e) {
		        if (p == null || e == null) {
		            throw new IllegalArgumentException("Player ili Enemy su null.");
		        }
		        int damage = e.getEffectiveDamage();
		        int oldHp = p.getHealth();
		        int newHp = oldHp - damage;
		        if (newHp < 0) newHp = 0;
		        p.setHealth(newHp);

		        String log = "HIT: " + p.getName() + " by " + e.getType() +
		                " for " + damage + " -> HP " + oldHp + " -> " + newHp;
		        eventLog.add(log);
		    }

		    public void addEnemy(Enemy e) {
		        if (e == null) {
		            throw new IllegalArgumentException("Enemy ne smije biti null.");
		        }
		        enemies.add(e);
		        eventLog.add("SPAWN: " + e.toString());
		    }

		    public List<Enemy> findByType(String query) {
		        List<Enemy> result = new ArrayList<>();
		        if (query == null) return result;

		        String q = query.toLowerCase();
		        for (Enemy e : enemies) {
		            if (e.getType().toLowerCase().contains(q)) {
		                result.add(e);
		            }
		        }
		        return result;
		    }

		    public List<Enemy> collidingWithPlayer() {
		        List<Enemy> result = new ArrayList<>();
		        for (Enemy e : enemies) {
		            if (checkCollision(player, e)) {
		                result.add(e);
		            }
		        }
		        return result;
		    }

		    public void resolveCollisions() {
		        for (Enemy e : enemies) {
		            if (checkCollision(player, e)) {
		                decreaseHealth(player, e);
		            }
		        }
		    }
}
