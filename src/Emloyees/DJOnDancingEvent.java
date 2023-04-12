package Emloyees;

public class DJOnDancingEvent {

    public int[] DJIds;
    public int[] dancingEventIds;
    public String[] songs;
    public int numberOfSpeakers;

    public DJOnDancingEvent(int[] DJIds, int[] dancingEventIds, String[] songs, int numberOfSpeakers) {
        this.DJIds = DJIds;
        this.dancingEventIds = dancingEventIds;
        this.songs = songs;
        this.numberOfSpeakers = numberOfSpeakers;
    }
}
