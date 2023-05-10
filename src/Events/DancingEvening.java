package Events;

import Emloyees.DJOnDancingEvening;
import Utils.Reservation;

import java.util.ArrayList;

public class DancingEvening extends Event {
    private String theme;
    private String[] decorations;
    private ArrayList<DJOnDancingEvening> djOnDancingEvening = new ArrayList<DJOnDancingEvening>();
    private ArrayList<Reservation> reservations = new ArrayList<>();


    public DancingEvening(int id, String name, String date, String startHour, String endHour, String theme, String[] decoration, EventType eventType) {
        super(id, name, date, startHour, endHour, eventType);
        this.theme = theme;
        this.decorations = decoration;
    }

    public void addDjOnDancingEvent(DJOnDancingEvening djOnEvening) {
        if (!djOnDancingEvening.contains(djOnEvening)) {
            djOnDancingEvening.add(djOnEvening);
        }
    }

    public void showDJs() {
        for (DJOnDancingEvening djOnDancingEvening : this.djOnDancingEvening) {
            System.out.println(djOnDancingEvening.dj);
        }
    }

    public void addReservation(Reservation reservation) throws Exception {
        if (reservations.size() < 4) {
            this.reservations.add(reservation);
        } else {
            throw new Exception("Too many reservations!");
        }
    }

}
