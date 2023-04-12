package Emloyees;

public class TemporaryEmployee extends Employee{
    private String company;
    public TemporaryEmployee(String birthDate, String PESEL, int id, String firstName, String lastName, String company) {
        super(birthDate, PESEL, id, firstName, lastName);
        this.company = company;
    }
}
