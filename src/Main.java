import Emloyees.Barman;
import Emloyees.DJ;
import Emloyees.DJOnDancingEvening;
import Emloyees.Waiter;
import Events.Birthday;
import Events.Cake;
import Events.DancingEvening;
import Events.MovieNight;
import Objects.Movie;

import java.util.UUID;

public class Main {
    public static void main(String[] args) throws Exception {

        String[] certificates;
        Barman barman1 = new Barman("10.01.1999", "0101199911123", 3999.99, 1,
                "10.02.2022", 31, 3, new int[]{1, 2}, "Jan", "Kowlaski");

        Barman barman2 = new Barman("10.01.1998", "0101199811124", 3999.99, 2,
                "10.02.2021", 81, 8, new int[]{2}, "Marta", "Podmiecka");

        Waiter waiter1 = new Waiter("10.05.2022", "1005202234565", 3000, "20.01.2022",
                24, 1, "Jan", "Kowalik", new String[]{"polski", "francuski", "angielski"});

        Waiter waiter2 = new Waiter("10.07.2022", "1005202234565", 3230, "20.01.2022",
                24, 1, "Kazimierz", "Baran", new String[]{"polski", "angielski"});

        Birthday birthday1 = new Birthday(1, "20-Janusza", "02.02.2020", "20:00", "24:00", Cake.CHEESECAKE,
                "Janusz", 20);
        Birthday birthday2 = new Birthday(2, "24-Marka", "03.02.2020", "20:00", "24:00", Cake.CHOCOLATE,
                "Marek", 24);


        System.out.println("============ZWYKLA============");
        birthday1.addWaiter(waiter1);
        waiter2.addBirthday(birthday2);
        System.out.println("WAITER 1:   " + waiter1.getBirthdays());
        System.out.println("WAITER 2: " + waiter2.getBirthdays());
        System.out.println("BIRTHDAY 1: " + birthday1.getWaiters());
        System.out.println("BIRTHDAY 2: " + birthday2.getWaiters());


        System.out.println("============Z ATRYBUTEM============");
        DJ DJMarian = new DJ("10.02.1997", "1002199700932", 1, "Marian", "Koszalek", "Music Inc.", "Marian");

        DancingEvening dancingEvening1 = new DancingEvening(1, "Potancowka", "12.09.2022", "20:00", "22:00", "USA",
                new String[]{"baloniki", "lampki"});
        DancingEvening dancingEvening2 = new DancingEvening(2, "NowyRok", "31.12.2023", "20:00", "01:00", "Party",
                new String[]{"ognie", "lampki"});


        DJOnDancingEvening DjOnEvening = new DJOnDancingEvening(new String[]{"dancing in the clouds", "listening to your heartbeat"}, 4, DJMarian, dancingEvening1);
        DJOnDancingEvening DjOnEvening2 = new DJOnDancingEvening(new String[]{"dancing in the clouds", "listening to your heartbeat"}, 40, DJMarian, dancingEvening2);

        System.out.println("DJ MARIAN EVENINGS: ");
        DJMarian.showDancingEvenings();
        System.out.println("DANCING EVENING1 DJS: ");
        dancingEvening1.showDJs();

        System.out.println("============KWALIFIKOWANA============");
        Movie movie1 = new Movie("Big Lebowski", 6.8, 142.23, 1);
        Movie movie2 = new Movie("Big Bang", 6.2, 112.23, 2);

        MovieNight movieNight1 = new MovieNight(1, "Big Movie Night", "19.01.2022", "19:00", "24:00", "Money", "Movies about making money");

        movie1.addMovieNight(movieNight1);
        movie2.addMovieNight(movieNight1);
        System.out.println(movieNight1.findMovieByID(2));

        System.out.println("============KOPMPOZYCJA============");


    }
}