import java.util.*;
public class Fuhrpark {
    public static void main(String[] args) {
        Vector fuhrpark = new Vector();
        Fahrzeug kfz1 = new Fahrzeug("Audi", "HD-XX 246", 180);
        Fahrzeug kfz2 = new Fahrzeug("BMW", "MA-LU 845", 170);
        Fahrzeug kfz3 = new Fahrzeug("VW", "MA-BA 563", 180);
        Fahrzeug kfz4 = new Fahrzeug("Saab", "MOS-FK 74", 90);

        fuhrpark.add(kfz1);
        fuhrpark.add(kfz2);
        fuhrpark.add(kfz3);
        fuhrpark.add(kfz4);


    }
}
