package Emloyees;


import Events.Birthday;
import Events.MovieNight;
import java.util.ArrayList;


public class Barman extends PermanentEmployee implements Cashier, Bartender {

    private final int experience;
    private final ArrayList<MovieNight> movieNights = new ArrayList<>();


    public Barman(String birthday, String PESEL, double salary, int id, String startDate, int weeksWorked, int experience, String firstName, String lastName, boolean isRetired) throws Exception {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName, isRetired);
        this.experience = experience;


    }

    public void addMovieNight(MovieNight movieNight) {
        if (!movieNights.contains(movieNight)) {
            movieNights.add(movieNight);
            movieNight.addBarman(this);
        }
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
