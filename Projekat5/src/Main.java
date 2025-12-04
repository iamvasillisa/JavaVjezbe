import javax.swing.SwingUtilities;

public class Main {
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            GameGUI app = new GameGUI();
	            app.setVisible(true);
	        });
	    }
	}

