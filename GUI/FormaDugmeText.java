package udg.edu.me;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FormaDugmeText extends JFrame {
	
	private JLabel labela;
	private JButton dugme;
	private JTextField tekst;
	
	public FormaDugmeText() {
		super("Forma sa dugmetom i tekstom");
		setSize(250,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		labela = new JLabel("Ovdje upisujemo tekst"); 
		add(labela);
		tekst = new JTextField("Upisi nesto ovdje", 15); 
		add(tekst);
		dugme = new JButton("Dugme"); 
		add(dugme);
		
		ObradjivacDogadjaja obrDog = new ObradjivacDogadjaja();
		dugme.addActionListener(obrDog);
		tekst.addActionListener(obrDog);
			 
	}
	
	private  class ObradjivacDogadjaja implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == dugme)
				labela.setText(tekst.getText()+ " (D) ");
			else if (e.getSource()==tekst)
				labela.setText(tekst.getText()+ "(T) ");
				
		}
		
	}
}

	
	

