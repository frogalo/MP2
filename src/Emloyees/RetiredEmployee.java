package Emloyees;

public class RetiredEmployee extends PermanentEmployee {

    public RetiredEmployee(String birthday, String PESEL, double salary, String startDate, int weeksWorked, int id, String firstName, String lastName) {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName, true);

    }

    @Override
    public void doWork() {
        System.out.println(this.firstName + " " + this.lastName + " has retired thus is no longer working");
    }

    @Override
    public void countPayments() {
        System.out.println(this.firstName + " " + this.lastName + " has retired thus is no longer receiving salary");
        System.out.println(this.firstName + " " + this.lastName + " has received " + Math.round(this.salary * this.weeksWorked) + "$ TOTAL when he was working");
    }
}
