package Utils;

import Events.DancingEvening;
import Objects.Room;

import java.time.LocalTime;

public class Reservation {
    public LocalTime time;
    public int reservationNumber;
    DancingEvening dancingEvening;
    Room room;

    public  Reservation(LocalTime time, int reservationNumber, DancingEvening dancingEvening, Room room) throws Exception {
        this.time = time;
        this.reservationNumber = reservationNumber;
        this.dancingEvening = dancingEvening;
        this.room = room;
        room.addReservation(this);
        dancingEvening.addReservation(this);
    }
}
