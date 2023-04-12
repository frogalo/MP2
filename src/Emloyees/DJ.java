package Emloyees;

import Objects.Contract;

import java.util.ArrayList;

public class DJ extends TemporaryEmployee {
    private String pseudonym;
    private ArrayList<DJOnDancingEvening> djOnDancingEvening = new ArrayList<DJOnDancingEvening>();
    private ArrayList<Contract> contracts = new ArrayList<Contract>();

    public DJ(String birthDate, String PESEL, int id, String firstName, String lastName, String company, String pseudonym) {
        super(birthDate, PESEL, id, firstName, lastName, company);
        this.pseudonym = pseudonym;
    }

    public void addDjOnDancingEvent(DJOnDancingEvening djOnEvening) {
        if (!djOnDancingEvening.contains(djOnEvening)) {
            djOnDancingEvening.add(djOnEvening);
        }
    }

    public void showDancingEvenings() {
        for (DJOnDancingEvening djOnDancingEvening : this.djOnDancingEvening) {
            System.out.println(djOnDancingEvening.dancingEvening);
        }
    }

    public void addContract(Contract contract) {
        if (!contracts.contains(contract)) {
            contracts.add(contract);
        }
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    @Override
    public String toString() {
        return "DJ{" +
                "pseudonym='" + pseudonym + '\'' +
                ", djOnDancingEvening=" + djOnDancingEvening +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
