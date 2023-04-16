package Emloyees;

public abstract class PermanentEmployee extends Employee {
    protected double salary;
    protected String startDate;
    protected int weeksWorked;
    protected boolean isRetired;

    public PermanentEmployee(String birthday, String PESEL, double salary, String startDate, int weeksWorked, int id, String firstName, String lastName, boolean isRetired) {
        super(birthday, PESEL, id, firstName, lastName);
        this.salary = salary;
        this.startDate = startDate;
        this.weeksWorked = weeksWorked;
        this.isRetired = isRetired;
    }


    public double getSalary() {
        return salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getWeeksWorked() {
        return weeksWorked;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "salary=" + salary +
                ", startDate='" + startDate + '\'' +
                ", weeksWorked=" + weeksWorked +
                '}';
    }
    public boolean isRetired() {
        return isRetired;
    }


    public abstract void countPayments();
}
