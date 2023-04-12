package Events;

public class Event {
    public int id;
    private String name;
    private String date;
    private String startHour;
    private String endHour;

    public Event(int id, String name, String date, String startHour, String endHour) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }
}
