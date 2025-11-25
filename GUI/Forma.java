package udg.edu.me;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Forma  extends JFrame{
	
	private JLabel lab1, lab2;
	
	public Forma() {
		super("Nasa prva forma");
		setSize(250, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		lab1= new JLabel("Obican tekst");
		add(lab1);
		
		ImageIcon ikonica = new ImageIcon ("UDG.jpg");
		lab2 = new JLabel("Tekst sa slikom");
		lab2.setIcon(ikonica);
		lab2.setVerticalTextPosition(SwingConstants.BOTTOM);
		lab2.setHorizontalTextPosition(SwingConstants.CENTER);
		add(lab2);
		
	}

}
