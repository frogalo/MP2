package Events;

import Emloyees.Waiter;

import java.util.ArrayList;

public class Birthday extends Event {
    private final Cake cake;
    private final String personName;
    private final int age;
    public final static int maxNumberOfGuests = 110;
    private int numberOfGuests;
    public ArrayList<Waiter> waiters = new ArrayList<>();


    public Birthday(int id, String name, String date, String startHour, String endHour, Cake cake, String personName, int age, int numberOfGuests) throws Exception {
        super(id, name, date, startHour, endHour);
        this.cake = cake;
        this.personName = personName;
        this.age = age;
        setNumberOfGuests(numberOfGuests);
    }

    public void addWaiter(Waiter waiter) {
        if (!waiters.contains(waiter)) {
            waiters.add(waiter);
            waiter.addBirthday(this);
        }
    }

    public void setNumberOfGuests(int numberOfGuests) throws Exception {
        if (numberOfGuests < maxNumberOfGuests) {
            this.numberOfGuests = numberOfGuests;
            System.out.println("numberOfGuests: " + numberOfGuests);
        } else {
            throw new Exception("Number of guests cannot be greater than " + maxNumberOfGuests);
        }
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "cake=" + cake +
                ", personName='" + personName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public String getPersonName() {
        return personName;
    }

    public ArrayList<Waiter> getWaiters() {
        return waiters;
    }
}
