package Emloyees;

import Events.Birthday;

import java.util.Map;
import java.util.TreeMap;

public class Waiter extends PermanentEmployee {
    private String[] languages;
    private Map<Integer, Birthday> birthdayQualif = new TreeMap<>();

    public Waiter(String birthday, String PESEL, double salary, String startDate, int weeksWorked, int id, String firstName, String lastName, String[] languages) {
        super(birthday, PESEL, salary, startDate, weeksWorked, id, firstName, lastName);
        this.languages = languages;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<Integer, Birthday> getBirthdayQualif() {
        return birthdayQualif;
    }

    public void setBirthdayQualif(Map<Integer, Birthday> birthdayQualif) {
        this.birthdayQualif = birthdayQualif;
    }

    public void addBirthdayQualif(Birthday newBirthday) {
        if (!birthdayQualif.containsKey(newBirthday.id)) {
            birthdayQualif.put(newBirthday.id, newBirthday);
            newBirthday.addWaiter(this);
        }
    }

    public Birthday findBirthdayQualif(int id) throws Exception {
        if (!birthdayQualif.containsKey(id)) {
            throw new Exception("Unable to find birthday");
        }
        return birthdayQualif.get(id);
    }
}
