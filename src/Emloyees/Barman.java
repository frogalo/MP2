package Emloyees;


import java.util.Arrays;

public class Barman extends PermanentEmployee implements Cashier, Bartender {
    public int[] birthdayIds;
    private int experience;


    public Barman(String birthday, String PESEL, double salary, int id, String startDate, int weeksWorked, int experience, int[] birthdayIds, String firstName, String lastName, boolean isRetired) {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName, isRetired);
        this.experience = experience;
        this.birthdayIds = birthdayIds;

    }

    public int[] getBirthdayIds() {
        return birthdayIds;
    }

    public int getExperience() {
        return experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Barman{" +
                "birthdayIds=" + Arrays.toString(birthdayIds) +
                ", experience=" + experience +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public void countPayments() {
        System.out.println("TOTAL OF PAYMENTS\t" + Math.round(this.weeksWorked * this.salary) + "$");
    }

    public void doWork() {
        System.out.println("Barman is preparing delicious drinks");
    }

    @Override
    public void mixDrinks() {
        System.out.println("Barman is mixing delicious drinks");
    }

    @Override
    public void receivePayment() {
        System.out.println("Barman is receiving payment");
    }
}
