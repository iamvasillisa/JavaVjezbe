import java.util.Scanner;

public class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private int ocjena1;
    private int ocjena2;
    private int ocjena3;

    // Konstruktor
    public Student(String ime, String prezime, String brojIndeksa, int ocjena1, int ocjena2, int ocjena3) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.ocjena1 = ocjena1;
        this.ocjena2 = ocjena2;
        this.ocjena3 = ocjena3;
    }

    // Metod za izračunavanje prosečne ocjene
    public double izracunajProsek() {
        return (ocjena1 + ocjena2 + ocjena3) / 3.0; // Vraća prosek
    }

    // Metod za proveru prava na studentski kredit
    public boolean imaPravoNaKredit() {
        return izracunajProsek() > 9; // Prosek veći od 9
    }
 // Metod za ispis informacija o studentu
    public void ispisiInformacije() {
        String stipendija = imaPravoNaKredit() ? "Da" : "Ne";
        System.out.println(ime + " " + prezime + ", Stipendija: " + stipendija);
    }

    // Glavna metoda za unos podataka
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite ime studenta: ");
        String ime = scanner.nextLine();
        System.out.println("Unesite prezime studenta: ");
        String prezime = scanner.nextLine();

        System.out.println("Unesite broj indeksa: ");
        String brojIndeksa = scanner.nextLine();

        System.out.println("Unesite tri ocjene (odvojene razmakom): ");
        String[] ocjeneInput = scanner.nextLine().split(" ");
        int ocjena1 = Integer.parseInt(ocjeneInput[0]);
        int ocjena2 = Integer.parseInt(ocjeneInput[1]);
        int ocjena3 = Integer.parseInt(ocjeneInput[2]);

        // Kreiramo novog studenta
        Student student = new Student(ime, prezime, brojIndeksa, ocjena1, ocjena2, ocjena3);
     // Ispisujemo informacije o studentu
        student.ispisiInformacije();

        scanner.close();
    }
}