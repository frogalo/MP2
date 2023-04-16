package Emloyees;

import Events.Birthday;

import java.util.ArrayList;
import java.util.Arrays;

public class Waiter extends PermanentEmployee {
    private final String[] languages;
    private final ArrayList<Birthday> birthdays = new ArrayList<>();
    CashierAspect cashierAspect;
    CleanerAspect cleanerAspect;

    public Waiter(String birthday, String PESEL, double salary, String startDate, int weeksWorked, int id, String firstName, String lastName, String[] languages, boolean isRetired) {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName, isRetired);
        this.languages = languages;
        this.cashierAspect = new CashierAspect(this.birthDate, this.PESEL, this.salary, this.startDate, this.weeksWorked, this.id, this.firstName, this.lastName, false);
        this.cleanerAspect = new CleanerAspect(this.birthDate, this.PESEL, this.salary, this.startDate, this.weeksWorked, this.id, this.firstName, this.lastName, 21, false);
    }

    public void addBirthday(Birthday birthday) {
        if (!birthdays.contains(birthday)) {
            birthdays.add(birthday);
            birthday.addWaiter(this);
        }
    }


    @Override
    public String toString() {
        return "Waiter{" +
                "languages=" + Arrays.toString(languages) +
                ", birthdays=" + birthdays +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public void doWork() {
        System.out.println(this.firstName + " " + this.lastName + " is delivering tasty food");
        this.cleanerAspect.doWork();
        this.cashierAspect.doWork();
        this.cleanerAspect.clean();
    }

    @Override
    public void countPayments() {
        System.out.println("TOTAL OF PAYMENTS\t" + Math.round(this.weeksWorked * this.salary) + "$");
    }
}
