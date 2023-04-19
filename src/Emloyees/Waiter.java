package Emloyees;

import Events.Birthday;
import Events.MovieNight;
import Objects.Table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Waiter extends PermanentEmployee {
    private final String[] languages;
    private final ArrayList<Birthday> birthdays = new ArrayList<>();
    private final ArrayList<MovieNight> movieNights = new ArrayList<>();
    CashierAspect cashierAspect;
    CleanerAspect cleanerAspect;
    private Map<Integer, Table> tables = new HashMap<>();

    public Waiter(String birthday, String PESEL, double salary, String startDate, int weeksWorked, int id, String firstName, String lastName, String[] languages, boolean isRetired) throws Exception {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName, isRetired);
        this.languages = languages;
        this.cashierAspect = new CashierAspect(this.birthDate, this.PESEL, this.salary, this.startDate, this.weeksWorked, this.id, this.firstName, this.lastName, false);
        this.cleanerAspect = new CleanerAspect(this.birthDate, this.PESEL, this.salary, this.startDate, this.weeksWorked, this.id, this.firstName, this.lastName, 21, false);
    }

    public void addTable(Table table) throws Exception {
        if (this.tables.containsKey(table.number)) {
            throw new Exception("Table already with this number already exists");
        }
        this.tables.put(table.number, table);
        table.waiter = this;
    }

    public void showTables(){
        System.out.println(this.tables.toString());
    }
    public void addBirthday(Birthday birthday) {
        if (!birthdays.contains(birthday)) {
            birthdays.add(birthday);
            birthday.addWaiter(this);
        }
    }

    public void addMovieNight(MovieNight movieNight) {
        if (!movieNights.contains(movieNight)) {
            movieNights.add(movieNight);
            movieNight.addWaiter(this);
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

    public void writeBirthdays() {
        System.out.println("WAITER:" + this.firstName);
        for (Birthday birthday : this.birthdays) {
            System.out.println(birthday.toString());
        }
    }
}
