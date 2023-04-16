package Emloyees;

import Objects.Contract;

import java.util.ArrayList;

import java.util.HashSet;


public class DJ extends TemporaryEmployee {
    private final String pseudonym;
    private final ArrayList<DJOnDancingEvening> djOnDancingEvening = new ArrayList<>();
    private final ArrayList<Contract> contracts = new ArrayList<>();
    private final HashSet<DJType> DJKinds = new HashSet<>();
    private int numberOfFans;
    private int yearsOfExperience;

    public DJ(String birthDate, String PESEL, int id, String firstName, String lastName, String company, String pseudonym, DJType djType) {
        super(birthDate, PESEL, id, firstName, lastName, company);
        this.pseudonym = pseudonym;
        DJKinds.add(djType);
    }

    public void addDjOnDancingEvent(DJOnDancingEvening djOnEvening) {
        if (!djOnDancingEvening.contains(djOnEvening)) {
            djOnDancingEvening.add(djOnEvening);
        }
    }

    public void setNumberOfFans(int numberOfFans) throws Exception {
        if (!this.DJKinds.contains(DJType.FAMOUS)) {
            if (numberOfFans > 1000) {
                throw new Exception("Number of fans cannot be greater than 1000 for unknown DJ");
            } else {
                this.numberOfFans = numberOfFans;
                System.out.println(this.firstName + " " + this.lastName + " has " + numberOfFans + " fans");
            }
        }

    }

    public void setUnknown(int numberOfFans) throws Exception {
        if (!this.DJKinds.contains(DJType.FAMOUS)) {
            throw new Exception("This DJ is not famous");
        } else if (numberOfFans > 1000) {
            throw new Exception("Number of fans is too big to make " + this.firstName + " " + this.lastName + " unknown");
        } else {
            this.DJKinds.remove(DJType.FAMOUS);
            this.DJKinds.add(DJType.UNKNOWN);
            System.out.println(this.firstName + " " + this.lastName + " is not a famous DJ anymore");
        }
    }

    public void setFamous(int numberOfFans) throws Exception {
        if (numberOfFans < 1000) {
            throw new Exception("Number of fans for famous DJ cannot be less than 1000");
        } else {
            DJKinds.add(DJType.FAMOUS);
            this.setNumberOfFans(numberOfFans);
            DJKinds.remove(DJType.UNKNOWN);
            System.out.println(this.firstName + " " + this.lastName + " is now a famous DJ with " + numberOfFans + " fans");
        }
    }

    public void setExperienced(int yearsOfExperience) throws Exception {
        DJKinds.add(DJType.EXPERIENCED);
        this.setYearsOfExperience(yearsOfExperience);
        System.out.println(this.firstName + " " + this.lastName + " is now an experienced DJ");
        DJKinds.remove(DJType.INEXPERIENCED);
    }

    public void setYearsOfExperience(int yearsOfExperiance) throws Exception {
        if (!DJKinds.contains(DJType.EXPERIENCED)) {
            throw new Exception("You can't add years of experience to not experienced DJ");
        }
        this.yearsOfExperience = yearsOfExperiance;
        System.out.println(this.firstName + " " + this.lastName + " has " + yearsOfExperiance + " years of experience");
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

    @Override
    public void doWork() {
        System.out.println("DJ is playing great music");
    }

    public int getNumberOfFans() {
        return numberOfFans;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
