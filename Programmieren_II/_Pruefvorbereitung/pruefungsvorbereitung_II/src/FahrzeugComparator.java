import java.util.Comparator;

public class FahrzeugComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Fahrzeug firstVehicle = (Fahrzeug)o1;
        Fahrzeug secondVehicle = (Fahrzeug)o2;

        if (firstVehicle.getPs() != secondVehicle.getPs()){
            return firstVehicle.getPs() - secondVehicle.getPs();
        }

        int val = firstVehicle.getMarke().compareTo(secondVehicle.getMarke());
        if (val != 0) return val;

        return firstVehicle.getKfzKz().compareTo(secondVehicle.getKfzKz());
    }
}
