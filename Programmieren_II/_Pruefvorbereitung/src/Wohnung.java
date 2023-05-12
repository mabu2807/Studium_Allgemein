public class Wohnung {

    private int Miete;
    private int Quadratmeter;
    private int Zimmer;
    private boolean Balkon;
    private Mieter Mieter;

    public Wohnung(){}
    public Wohnung(int miete, int quadratmeter, int zimmer, boolean balkon, Mieter mieter) {
        Miete = miete;
        Quadratmeter = quadratmeter;
        Zimmer = zimmer;
        Balkon = balkon;
        Mieter = mieter;
    }

    public int getMiete() {
        return Miete;
    }

    public void setMiete(int miete) {
        Miete = miete;
    }

    public int getQuadratmeter() {
        return Quadratmeter;
    }

    public void setQuadratmeter(int quadratmeter) {
        Quadratmeter = quadratmeter;
    }

    public int getZimmer() {
        return Zimmer;
    }

    public void setZimmer(int zimmer) {
        Zimmer = zimmer;
    }

    public boolean isBalkon() {
        return Balkon;
    }

    public void setBalkon(boolean balkon) {
        Balkon = balkon;
    }

    public Mieter getMieter() {
        return Mieter;
    }

    public void setMieter(Mieter mieter) {
        Mieter = mieter;
    }
}
