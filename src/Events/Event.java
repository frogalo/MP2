package Events;

import Emloyees.DJType;

import java.util.HashSet;

public abstract class Event {
    public int id;
    protected final String name;
    protected final String date;
    protected final String startHour;
    protected final String endHour;
    private final HashSet<EventType> eventTypes = new HashSet<>();

    public Event(int id, String name, String date, String startHour, String endHour, EventType eventType) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
        eventTypes.add(eventType);
    }

    public void makeFun() {
        if (!this.eventTypes.contains(EventType.FUN)) {
            eventTypes.add(EventType.FUN);
            System.out.println(this.name + " is now fun");
        }
    }
    public void makeInteresting() {
        if (!this.eventTypes.contains(EventType.INTERESTING)) {
            eventTypes.add(EventType.INTERESTING);
            System.out.println(this.name + " is now interesting");
        }
    }


    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", startHour='" + startHour + '\'' +
                ", endHour='" + endHour + '\'' +
                '}';
    }
}
