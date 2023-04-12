package Events;

import Emloyees.DJOnDancingEvening;

import java.util.ArrayList;

public class DancingEvening extends Event {
    private String theme;
    private String[] decorations;
    private ArrayList<DJOnDancingEvening> djOnDancingEvening = new ArrayList<DJOnDancingEvening>();


    public DancingEvening(int id, String name, String date, String startHour, String endHour, String theme, String[] decoration) {
        super(id, name, date, startHour, endHour);
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


}
