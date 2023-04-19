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
                this.makeFamous(numberOfFans);
            } else {
                this.numberOfFans = numberOfFans;
                System.out.println(this.firstName + " " + this.lastName + " has " + numberOfFans + " fans");
            }
        }else {
            if (numberOfFans < 1000){
                this.makeUnknown(numberOfFans);
            }
        }

    }

    public void makeUnknown(int numberOfFans) throws Exception {
        if (numberOfFans > 1000) {
            throw new Exception("Number of fans is too big to make " + this.firstName + " " + this.lastName + " unknown");
        } else if (this.DJKinds.contains(DJType.UNKNOWN)) {
            throw new Exception("DJ " + this.firstName + " " + this.lastName + " is already unknown");
        } else {
            if (this.DJKinds.contains(DJType.FAMOUS)) {
                this.DJKinds.remove(DJType.FAMOUS);
                System.out.println(this.firstName + " " + this.lastName + " is not a famous DJ anymore");
            }
            this.DJKinds.add(DJType.UNKNOWN);
            System.out.println(this.firstName + " " + this.lastName + " is now an unknown DJ");
        }
    }

    public void makeFamous(int numberOfFans) throws Exception {
        if (numberOfFans < 1000) {
            throw new Exception("Number of fans for famous DJ cannot be less than 1000");
        } else if (this.DJKinds.contains(DJType.FAMOUS)) {
            throw new Exception("DJ " + this.firstName + " " + this.lastName + " is already famous");
        } else {
            if (this.DJKinds.contains(DJType.UNKNOWN)) {
                DJKinds.remove(DJType.UNKNOWN);
                System.out.println(this.firstName + " " + this.lastName + " is not an unknown DJ anymore");
            }
            DJKinds.add(DJType.FAMOUS);
            this.setNumberOfFans(numberOfFans);
            System.out.println(this.firstName + " " + this.lastName + " is now a famous DJ with " + numberOfFans + " fans");
        }
    }

    public void makeInexperienced(int yearsOfExperience) throws Exception {
        if (yearsOfExperience >= 2) {
            throw new Exception("DJ " + this.firstName + " " + this.lastName + " have too many years of experience to be an inexperienced DJ");
        } else if (this.DJKinds.contains(DJType.INEXPERIENCED)) {
            throw new Exception("DJ " + this.firstName + " " + this.lastName + " is already an inexperienced DJ");
        } else {
            if (this.DJKinds.contains(DJType.EXPERIENCED)) {
                this.DJKinds.remove(DJType.EXPERIENCED);
                System.out.println(this.firstName + " " + this.lastName + " is not an experienced DJ anymore");
            }
            this.DJKinds.add(DJType.INEXPERIENCED);
            System.out.println(this.firstName + " " + this.lastName + " is now an inexperienced DJ");
        }
    }

    public void makeExperienced(int yearsOfExperience) throws Exception {
        if (yearsOfExperience < 2) {
            throw new Exception("DJ " + this.firstName + " " + this.lastName + " doesn't have enough experience");
        } else if (this.DJKinds.contains(DJType.EXPERIENCED)) {
            throw new Exception("DJ " + this.firstName + " " + this.lastName + " is already an experienced DJ");
        } else {
            if (this.DJKinds.contains(DJType.INEXPERIENCED)) {
                this.DJKinds.remove(DJType.INEXPERIENCED);
                System.out.println(this.firstName + " " + this.lastName + " is not an inexperienced DJ anymore");
            }
            this.DJKinds.add(DJType.EXPERIENCED);
            System.out.println(this.firstName + " " + this.lastName + " is now an experienced DJ");
        }
    }

    public void setYearsOfExperience(int yearsOfExperience) throws Exception {
        if (!DJKinds.contains(DJType.EXPERIENCED)) {
            throw new Exception("You can't add years of experience to not experienced DJ");
        }
        this.yearsOfExperience = yearsOfExperience;
        System.out.println(this.firstName + " " + this.lastName + " has " + yearsOfExperience + " years of experience");
        if (yearsOfExperience >= 2) {
            this.makeExperienced(yearsOfExperience);
        } else {
            this.makeInexperienced(yearsOfExperience);
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

    public HashSet<DJType> getDJKinds() {
        return DJKinds;
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
