package Emloyees;


import java.util.HashMap;

public abstract class Employee {
    public int id;
    protected String PESEL;
    protected String birthDate;
    protected String firstName;
    protected String lastName;


    public Employee(String birthDate, String PESEL, int id, String firstName, String lastName) throws Exception {
        this.id = id;
        this.PESEL = PESEL;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", PESEL='" + PESEL + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    public int getId() {
        return id;
    }

    public String getPESEL() {
        return PESEL;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void doWork();


}
