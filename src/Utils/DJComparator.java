package Utils;


import Emloyees.DJ;


import java.util.Comparator;

public class DJComparator implements Comparator<DJ> {

    @Override
    public int compare(DJ dj1, DJ dj2) {
        return dj1.getLastName().compareTo(dj2.getLastName());
    }
}
