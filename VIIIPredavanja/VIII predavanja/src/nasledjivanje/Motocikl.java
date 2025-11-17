package nasledjivanje;

public class Motocikl extends Vozilo {
    private int kilometraza;

    public int getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(int kilometraza) {
        this.kilometraza = kilometraza;
    }

    @Override
    public float cijenaRegistracije() {
        return ((float) this.getKubikaza() / 5 - (float) this.getKilometraza() / 1000) * Vozilo.getOsnovicaZaRegistraciju();
    }
    public Motocikl(String marka, String model, int kubikaza, int godiste, int kilometraza) {
        super(marka, model, kubikaza, godiste);
        this.setKilometraza(kilometraza);
    }

    public Motocikl() {
        this(null, null, 0, 0, 0);
    }

    @Override
    public String toString() {
        return "Motocikl [kilometraza=" + getKilometraza() + ", marka=" + getMarka() +
                ", model=" + getModel() + ", kubikaza=" + getKubikaza() + ", godiste=" + getGodiste() + "]";
    }
}
	

