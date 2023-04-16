package Emloyees;

public class CashierAspect extends PermanentEmployee implements Cashier {
    public CashierAspect(String birthday, String PESEL, double salary, String startDate, int weeksWorked, int id, String firstName, String lastName, boolean isRetired) {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName, isRetired);
    }

    @Override
    public void receivePayment() {
        System.out.println(this.firstName + " " + this.lastName + " is receiving payment as an cashier");
    }

    @Override
    public void doWork() {
        System.out.println(this.firstName + " " + this.lastName + " is working as cashier");
    }

    @Override
    public void countPayments() {
        System.out.println(this.firstName + " " + this.lastName + " received " + Math.round(salary * this.weeksWorked) + " as an cashier");
    }
}
