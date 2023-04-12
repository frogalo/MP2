package Emloyees;

import java.util.ArrayList;
import java.util.List;

public class DJ extends TemporaryEmployee {
    private String pseudonym;
    private static List<DJ> extent = new ArrayList<>();

    public DJ(String birthDate, String PESEL, int id, String firstName, String lastName, String company, String pseudonym) {
        super(birthDate, PESEL, id, firstName, lastName, company);
        this.pseudonym = pseudonym;
        extent.add(this);
    }
}
