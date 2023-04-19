package Emloyees;


public abstract class TemporaryEmployee extends Employee {
    private final String company;


    public TemporaryEmployee(String birthDate, String PESEL, int id, String firstName, String lastName, String company) throws Exception {
        super(birthDate, PESEL, id, firstName, lastName);
        this.company = company;
    }


    @Override
    public String toString() {
        return "TemporaryEmployee{" +
                "company='" + company + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
