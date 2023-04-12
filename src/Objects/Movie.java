package Objects;

import Events.MovieNight;

import java.util.ArrayList;
import java.util.UUID;

public class Movie {
    private String title;
    private double rating;
    private double duration;
    private int uuid;
    private ArrayList<MovieNight> movieNights = new ArrayList<MovieNight>();

    public Movie(String title, double rating, double duration, int uuid) {
        this.title = title;
        this.rating = rating;
        this.duration = duration;
        this.uuid = uuid;
    }

    public int getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", duration=" + duration +
                ", uuid=" + uuid +
                '}';
    }

    public void addMovieNight(MovieNight movieNight) {
        if(!movieNights.contains(movieNight)) {
            movieNights.add(movieNight);
            movieNight.addMovieQualif(this);
        }
    }
}
