package Emloyees;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public int id;
    private String PESEL;
    private String birthDate;
    public String firstName;
    public String lastName;

    public Employee(String birthDate, String PESEL, int id, String firstName, String lastName) {
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
}
