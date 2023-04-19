package Objects;

import Events.MovieNight;

import java.util.*;

public class Movie {
    private final String title;
    private final double rating;
    private final double duration;
    private final int uuid;
    private final ArrayList<MovieNight> movieNights = new ArrayList<MovieNight>();


    public Movie(String title, double rating, double duration, int uuid) throws Exception {

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
        if (!movieNights.contains(movieNight)) {
            movieNights.add(movieNight);
            movieNight.addMovieQualif(this);
        }
    }
}
