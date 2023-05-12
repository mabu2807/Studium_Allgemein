public class main {

    public static void main(String[] args) {

        Mieter Paul = new Mieter("Paul", "Meier", "29.07.2000", 3);
        Wohnheim Mannheim = new Wohnheim("Schulzenstraße", (byte) 3, "", (byte) 4, (byte) 3);

        System.out.println(Paul.getAnzahlMitMieter());
        System.out.println(Paul.getGeburtsdatum());

    }
}
