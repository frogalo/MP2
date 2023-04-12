package Emloyees;

import Events.Birthday;

import java.util.ArrayList;
import java.util.Arrays;

public class Waiter extends PermanentEmployee {
    private String[] languages;
    private ArrayList<Birthday> birthdays = new ArrayList<Birthday>();


    public Waiter(String birthday, String PESEL, double salary, String startDate, int weeksWorked, int id, String firstName, String lastName, String[] languages) {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName);
        this.languages = languages;
    }

    public void addBirthday(Birthday birthday) {
        if (!birthdays.contains(birthday)) {
            birthdays.add(birthday);
            birthday.addWaiter(this);
        }
    }

    public String[] getLanguages() {
        return languages;
    }

    public ArrayList<Birthday> getBirthdays() {
        return birthdays;
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
}
