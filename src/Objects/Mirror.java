package Objects;

public class Mirror {
    private int size;
    private Room room;

    public Mirror(int size) {
        this.size = size;
    }

    public void addRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Mirror{" +
                "size=" + size +
                ", room=" + room +
                '}';
    }
}
