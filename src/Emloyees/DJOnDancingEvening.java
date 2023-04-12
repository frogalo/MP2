package Emloyees;

import Events.DancingEvening;

import java.util.Arrays;

public class DJOnDancingEvening {


    public String[] songs;
    public int numberOfSpeakers;
    public DJ dj;
    public DancingEvening dancingEvening;


    public DJOnDancingEvening(String[] songs, int numberOfSpeakers, DJ dj, DancingEvening dancingEvening) {
        this.songs = songs;
        this.numberOfSpeakers = numberOfSpeakers;
        this.dj = dj;
        dj.addDjOnDancingEvent(this);
        this.dancingEvening = dancingEvening;
        dancingEvening.addDjOnDancingEvent(this);

    }

    @Override
    public String toString() {
        return "DJOnDancingEvening{" +
                "songs=" + Arrays.toString(songs) +
                ", numberOfSpeakers=" + numberOfSpeakers +
                '}';
    }
}
