package Emloyees;

import Objects.Contract;

import java.util.ArrayList;

public abstract class TemporaryEmployee extends Employee {
    private String company;


    public TemporaryEmployee(String birthDate, String PESEL, int id, String firstName, String lastName, String company) {
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
