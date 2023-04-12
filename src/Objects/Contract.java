package Objects;

import Emloyees.DJ;
import Emloyees.TemporaryEmployee;

public class Contract {
    private String date;
    private String duration;


    private Contract(String date, String duration) {
        this.date = date;
        this.duration = duration;
    }

    public static Contract createContract(String date, String duration, DJ dj) {
        Contract contract = new Contract(date, duration);
        dj.addContract(contract);
        return contract;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "date='" + date + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }


}
