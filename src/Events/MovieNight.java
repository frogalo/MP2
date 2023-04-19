package Events;

import Emloyees.Barman;
import Emloyees.Waiter;
import Objects.Movie;

import java.util.*;

public class MovieNight extends Event {
    private final String theme;
    private final String description;
    private final HashMap<Integer, Movie> moviesQualif = new HashMap<>();
    private final ArrayList<Barman> barmen = new ArrayList<>();
    private Waiter waiter;

    public MovieNight(int id, String name, String date, String startHour, String endHour, String theme, String description) {
        super(id, name, date, startHour, endHour);
        this.description = description;
        this.theme = theme;
    }

    public void addWaiter(Waiter waiter) {
        if (!(this.waiter == waiter)) {
            this.setWaiter(waiter);
            waiter.addMovieNight(this);
        }
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void addBarman(Barman barman) {
        if (!barmen.contains(barman)) {
            barmen.add(barman);
            barman.addMovieNight(this);
        }
    }

    public void addMovieQualif(Movie movie) {
        if (!moviesQualif.containsKey(movie.getUuid())) {
            moviesQualif.put(movie.getUuid(), movie);
            movie.addMovieNight(this);
        }
    }

    public Movie findMovieByID(int uuid) throws Exception {
        if (!moviesQualif.containsKey(uuid)) {
            throw new Exception("Movie " + uuid + " not found!");
        }
        return moviesQualif.get(uuid);
    }

    @Override
    public String toString() {
        return "MovieNight{" +
                "theme='" + theme + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }
}