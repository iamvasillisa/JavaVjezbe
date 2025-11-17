package nasledjivanje;

public class Kamion extends Vozilo {
    private int nosivost;

    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }

    @Override
    public float cijenaRegistracije() {
        return ((float) this.getKubikaza() / 10 + (2022 - this.getGodiste()) * 10) * Vozilo.getOsnovicaZaRegistraciju() + 30 * this.getNosivost();
    }
    public Kamion(String marka, String model, int kubikaza, int godiste, int nosivost) {
        super(marka, model, kubikaza, godiste);
        this.setNosivost(nosivost);
    }

    public Kamion() {
        this(null, null, 0, 0, 0);
    }

    @Override
    public String toString() {
        return "Kamion [nosivost=" + getNosivost() + ", marka=" + getMarka() +
                ", model=" + getModel() + ", kubikaza=" + getKubikaza() + ", godiste=" + getGodiste() + "]";
    }
}

	

