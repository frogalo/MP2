package Objects;

import Emloyees.DJType;
import Events.DancingEvening;
import Utils.Reservation;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Room {

    private int roomNumber;
    private double roomSize;

    private DancingEvening dancingEvening;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Room(int roomNumber, double roomSize) {
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
    }

    public void addReservation(Reservation reservation) {
        if (!this.reservations.contains(reservation)) {
            this.reservations.add(reservation);
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomSize=" + roomSize +
                '}';
    }
}

