public class Mieter {

    private String Vorname;
    private String Nachname;
    private String Geburtsdatum;
    private int AnzahlMitMieter;


    public Mieter(){}

    public Mieter(String vorname, String nachname, String geburtsdatum, int anzahlMitMieter) {
        Vorname = vorname;
        Nachname = nachname;
        Geburtsdatum = geburtsdatum;
        AnzahlMitMieter = anzahlMitMieter;
    }

    public String getVorname() {
        return Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getGeburtsdatum() {
        return Geburtsdatum;
    }

    public int getAnzahlMitMieter() {
        return AnzahlMitMieter;
    }

    public void setAnzahlMitMieter(int anzahlMitMieter) {
        AnzahlMitMieter = anzahlMitMieter;
    }
}
