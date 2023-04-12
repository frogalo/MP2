package Events;

import Objects.Movie;

import java.util.Dictionary;
import java.util.Enumeration;

import java.util.HashMap;
import java.util.UUID;

public class MovieNight extends Event {
    private String theme;
    private String description;
    private HashMap<Integer, Movie> moviesQualif = new HashMap<Integer, Movie>();

    public MovieNight(int id, String name, String date, String startHour, String endHour, String theme, String description) {
        super(id, name, date, startHour, endHour);
        this.description = description;
        this.theme = theme;
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