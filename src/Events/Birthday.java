package Events;

import Emloyees.Waiter;

import java.util.ArrayList;

public class Birthday extends Event {
    private Cake cake;
    private String personName;
    private int age;
    public int[] barmanIds;
    public ArrayList<Waiter> waiters;

    private static ArrayList<Birthday> extent = new ArrayList<Birthday>();

    public Birthday(int id, String name, String date, String startHour, String endHour, Cake cake, String personName, int age, int[] barmanIds) {
        super(id, name, date, startHour, endHour);
        this.cake = cake;
        this.personName = personName;
        this.age = age;
        this.barmanIds = barmanIds;
        extent.add(this);
    }

    private static Birthday findBirthday(int id) throws Exception {
        for (Birthday birthday : extent) {
            if (birthday.id == id) {
                return birthday;
            }
        }
        throw new Exception("Unable to find birthday with id = " + id);
    }

    public void addWaiter(Waiter waiter) {
        this.waiters.add(waiter);
    }
}
