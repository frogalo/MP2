package Emloyees;

public class PermanentEmployee extends Employee {
    private double salary;
    private String startDate;
    private int weeksWorked;

    public PermanentEmployee(String birthday, String PESEL, double salary, String startDate, int weeksWorked, int id, String firstName, String lastName) {
        super(birthday, PESEL, id, firstName, lastName);
        this.salary = salary;
        this.startDate = startDate;
        this.weeksWorked = weeksWorked;
    }

}
