package Events;

import Emloyees.DJ;

import java.util.ArrayList;
import java.util.List;

public class DancingEvening extends Event {
    private String theme;
    private String[] decorations;
    private int DJOnDancingEventId;
    private static List<DancingEvening> extent = new ArrayList<>();

    public DancingEvening(int id, String name, String date, String startHour, String endHour, String theme, String[] decoration, int DJOnDancingEventId) {
        super(id, name, date, startHour, endHour);
        this.theme = theme;
        this.decorations = decoration;
        this.DJOnDancingEventId = DJOnDancingEventId;
        extent.add(this);
    }
}
