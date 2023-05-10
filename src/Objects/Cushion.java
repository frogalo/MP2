package Objects;

public class Cushion {
    private String type;
    private Room room;

    public Cushion(String type) {
        this.type = type;
    }

    public void addRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Cushion{" +
                "type='" + type + '\'' +
                ", room=" + room +
                '}';
    }
}
