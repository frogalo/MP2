package Events;

import Emloyees.Waiter;

import java.util.ArrayList;

public class Birthday extends Event {
    private Cake cake;
    private String personName;
    private int age;
    public ArrayList<Waiter> waiters = new ArrayList<Waiter>();


    public Birthday(int id, String name, String date, String startHour, String endHour, Cake cake, String personName, int age) {
        super(id, name, date, startHour, endHour);
        this.cake = cake;
        this.personName = personName;
        this.age = age;
    }

    public void addWaiter(Waiter waiter) {
        if (!waiters.contains(waiter)) {
            waiters.add(waiter);
            waiter.addBirthday(this);
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

    public ArrayList<Waiter> getWaiters() {
        return waiters;
    }
}
