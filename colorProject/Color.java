
public class Color {

	public static void main(String[] args) {
	
	}
		// TODO Auto-generated method stub
		 private int red;   // Vrijednost crvene boje (0-255)
		    private int green; // Vrijednost zelene boje (0-255)
		    private int blue;  // Vrijednost plave boje (0-255)
	
		    // Konstruktor
		    public Color(int red, int green, int blue) {
		        setRed(red);
		        setGreen(green);
		        setBlue(blue);
		    }

		    // Getter i setter metode
		    public int getRed() {
		        return red;
		    }
		    public void setRed(int red) {
		        if (red < 0 || red > 255) {
		            System.out.println("Vrijednost za crvenu boju mora biti između 0 i 255.");
		        } else {
		            this.red = red;
		        }
		    }

		    public int getGreen() {
		        return green;
		    }

		    public void setGreen(int green) {
		        if (green < 0 || green > 255) {
		            System.out.println("Vrijednost za zelenu boju mora biti između 0 i 255.");
		        } else {
		            this.green = green;
		        }
		    }

		    public int getBlue() {
		        return blue;
		    }

		    public void setBlue(int blue) {
		        if (blue < 0 || blue > 255) {
		            System.out.println("Vrijednost za plavu boju mora biti između 0 i 255.");
		        } else {
		            this.blue = blue;
		        }
		    }

		    // Metod za dodavanje crvenoj boji
		    public void addRed(int change) {
		        red += change;
		        if (red < 0) {
		            red = 0;
		        } else if (red > 255) {
		            red = 255;
		        }
		    }

		    // Metod za dodavanje zelenoj boji
		    public void addGreen(int change) {
		        green += change;
		        if (green < 0) {
		            green = 0;
		        } else if (green > 255) {
		            green = 255;
		        }
		    }

		    // Metod za dodavanje plavoj boji
		    public void addBlue(int change) {
		        blue += change;
		        if (blue < 0) {
		            blue = 0;
		        } else if (blue > 255) {
		            blue = 255;
		        }
		    }

		    // Metod za ispisivanje boje
		    public void printColor() {
		        System.out.println("red: " + red + ", green: " + green + ", blue: " + blue);
		    }
		}
		
