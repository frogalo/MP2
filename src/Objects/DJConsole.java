package Objects;

import Emloyees.DJ;
import Utils.DJComparator;
import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class DJConsole {
    private final String name;
    private final int numberOfButtons;
    DJComparator djComparator = new DJComparator();
    public TreeSet<DJ> djs = new TreeSet<>(djComparator);

    public DJConsole(String name, int numberOfButtons) {
        this.name = name;
        this.numberOfButtons = numberOfButtons;
    }

    public void addDJ(DJ dj) throws Exception {
        if (!this.djs.contains(dj)) {
            djs.add(dj);
            dj.addConsole(this);
        }
    }

    @Override
    public String toString() {
        return "DJConsole{" +
                "name='" + name + '\'' +
                ", numberOfButtons=" + numberOfButtons +
                '}';
    }

    public TreeSet<DJ> getDjs() {
        return djs;
    }
}
