package Emloyees;

public class CleanerAspect extends PermanentEmployee implements Cleaner {
    int numberOfTablesToClean;

    public CleanerAspect(String birthday, String PESEL, double salary, String startDate, int weeksWorked, int id, String firstName, String lastName, int numberOfTablesToClean, boolean isRetired) throws Exception {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName, isRetired);
        this.numberOfTablesToClean = numberOfTablesToClean;
    }

    @Override
    public void clean() {
        System.out.println(this.firstName + " " + this.lastName + " is cleaning " + numberOfTablesToClean + " tables");
    }

    @Override
    public void doWork() {
        System.out.println(this.firstName + " " + this.lastName + " is working as cleaner");
    }

    @Override
    public void countPayments() {
        System.out.println(this.firstName + " " + this.lastName + " received " + Math.round(salary * this.weeksWorked) + " as an cleaner");
    }
}
