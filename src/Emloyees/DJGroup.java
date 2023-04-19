package Emloyees;

import java.util.ArrayList;
import java.util.List;

public class DJGroup {

    public String name;
    public String musicType;
    private DJ leadDJ;
    public List<DJ> djs = new ArrayList<DJ>();

    public DJGroup(String name, String musicType) {
        this.name = name;
        this.musicType = musicType;
    }

    public void addDJ(DJ dj) {
        if (this.djs.contains(dj)) {
            new Exception("dj already exists");
        }
        this.djs.add(dj);
        dj.addGroup(this);
    }

    public void setLeadDJ(DJ leadDJ) throws Exception {
        if (!this.djs.contains(leadDJ)) {
            throw new Exception("This dj is not in the group");
        }
        this.leadDJ = leadDJ;
    }

    public void showGroupMembers() {
        if (leadDJ != null) {
            System.out.println(djs.toString() + " and the leadDJ is " + leadDJ);
        } else {
            System.out.println(djs.toString() + " and there is no leadDJ");
        }
    }


}
