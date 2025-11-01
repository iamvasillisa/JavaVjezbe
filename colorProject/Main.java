
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Kreiramo objekat klase Color
        Color color = new Color(100, 150, 200);

        // Ispisujemo početne vrednosti boje
        color.printColor();

        // Dodajemo boje
        color.addRed(50);
        color.addGreen(-20);
        color.addBlue(300); // Ova promena će postaviti plavu na 255

        // Ispisujemo nove vrednosti boje
        color.printColor();
    }

	}


