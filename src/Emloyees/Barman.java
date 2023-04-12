package Emloyees;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Barman extends PermanentEmployee {
    public int[] birthdayIds;
    private static List<Barman> extent = new ArrayList<>();
    private int experiance;
    public String firstName;
    public String LastName;

    public Barman(String birthday, String PESEL, double salary, int id, String startDate, int weeksWorked, int experiance, int[] birthdayIds, String firstName, String lastName) {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName);
        extent.add(this);
        this.experiance = experiance;
        this.birthdayIds = birthdayIds;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Barman findBarman(int id) throws Exception {
        for (Barman barman : extent) {
            if (barman.id == id) {
                return barman;
            }
        }
        throw new Exception("Unable to find barman with id = " + id);
    }

    @Override
    public String toString() {
        return "Barman{" +
                "birthdayIds=" + Arrays.toString(birthdayIds) +
                ", experiance=" + experiance +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
