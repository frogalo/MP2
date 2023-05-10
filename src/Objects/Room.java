package Objects;

import Events.DancingEvening;
import Utils.Reservation;

import java.util.ArrayList;

public class Room {

    private int roomNumber;
    private double roomSize;

    public static int getForbiddenRoomSize() {
        return forbiddenRoomSize;
    }

    public static void setForbiddenRoomSize(int forbiddenRoomSize) {
        Room.forbiddenRoomSize = forbiddenRoomSize;
    }

    public static int forbiddenRoomSize = 13;

    private DancingEvening dancingEvening;
    private ArrayList<Reservation> reservations = new ArrayList<>();
    public Cushion cushion;
    public Mirror mirror;

    public Room(int roomNumber, double roomSize) throws Exception {
        this.roomNumber = setRoomNumber(roomNumber);
        this.roomSize = roomSize;
    }

    public void addReservation(Reservation reservation) {
        if (!this.reservations.contains(reservation)) {
            this.reservations.add(reservation);
        }
    }

    public int  setRoomNumber(int roomNumber) throws Exception {
        if (roomNumber != forbiddenRoomSize)
            this.roomNumber = roomNumber;
        else
            throw new Exception("Room number cannot be " + forbiddenRoomSize);
        return roomNumber;
    }

    public void addMirror(Mirror mirror) {
        this.cushion = null;
        this.mirror = mirror;
        mirror.addRoom(this);
    }

    public void addCushion(Cushion cushion) {
        this.mirror = null;
        this.cushion = cushion;
        cushion.addRoom(this);
    }

    public Cushion getCushion() {
        return cushion;
    }

    public Mirror getMirror() {
        return mirror;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomSize=" + roomSize +
                '}';
    }
}

