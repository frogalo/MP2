package Emloyees;


import java.util.Arrays;

public class Barman extends PermanentEmployee {
    public int[] birthdayIds;
    private int experience;
    public String firstName;
    public String LastName;

    public Barman(String birthday, String PESEL, double salary, int id, String startDate, int weeksWorked, int experience, int[] birthdayIds, String firstName, String lastName) {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName);

        this.experience = experience;
        this.birthdayIds = birthdayIds;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    @Override
    public String toString() {
        return "Barman{" +
                "birthdayIds=" + Arrays.toString(birthdayIds) +
                ", experience=" + experience +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
