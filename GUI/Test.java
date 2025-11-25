package udg.edu.me;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double broj;
		int dugme;
		String unos;
		
		unos = JOptionPane.showInputDialog(null, "Unijeti realan broj", 0.0);
		broj = Double.parseDouble(unos);
		dugme = JOptionPane.showConfirmDialog(null,  "Duplo je " + 2*broj, "Naslov", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		
		switch(dugme) {
		case  JOptionPane.YES_OPTION:
			System.out.println("Kliknuli ste YES dugme"); break;
		case JOptionPane.NO_OPTION:
			System.out.println("Kliknuli ste NO dugme"); break;
		case JOptionPane.CANCEL_OPTION:
			System.out.println("Kliknuli ste CANCEL dugme");
		}
	
	}

}
