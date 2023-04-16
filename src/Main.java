import Emloyees.*;
import Events.Birthday;
import Events.Cake;
import Events.DancingEvening;
import Events.MovieNight;
import Objects.Contract;
import Objects.Movie;
import Emloyees.DJType;


public class Main {
    public static void main(String[] args) throws Exception {


        Barman barman1 = new Barman("10.01.1999", "0101199911123", 3999.99, 1,
                "10.02.2022", 31, 3, new int[]{1, 2}, "Jan", "Kowlaski", false);

        Barman barman2 = new Barman("10.01.1998", "0101199811124", 3999.99, 2,
                "10.02.2021", 81, 8, new int[]{2}, "Marta", "Podmiecka", false);

        Waiter waiter1 = new Waiter("10.05.2022", "1005202234565", 3000, "20.01.2022",
                24, 1, "Jan", "Kowalik", new String[]{"polski", "francuski", "angielski"}, false);

        Waiter waiter2 = new Waiter("10.07.2022", "1005202234565", 3230, "20.01.2022",
                24, 1, "Kazimierz", "Baran", new String[]{"polski", "angielski"}, false);

        Birthday birthday1 = new Birthday(1, "20-Janusza", "02.02.2020", "20:00", "24:00", Cake.CHEESECAKE,
                "Janusz", 20);
        Birthday birthday2 = new Birthday(2, "24-Marka", "03.02.2020", "20:00", "24:00", Cake.CHOCOLATE,
                "Marek", 24);


//        System.out.println("============ZWYKLA============");
        birthday1.addWaiter(waiter1);
        waiter2.addBirthday(birthday2);
//        System.out.println("WAITER 1:   " + waiter1.getBirthdays());
//        System.out.println("WAITER 2: " + waiter2.getBirthdays());
//        System.out.println("BIRTHDAY 1: " + birthday1.getWaiters());
//        System.out.println("BIRTHDAY 2: " + birthday2.getWaiters());
//
//
//        System.out.println("============Z ATRYBUTEM============");
        DJ DJMarian = new DJ("10.02.1997", "1002199700932", 1, "Marian", "Koszalek", "Music Inc.", "Marian", DJType.FAMOUS);

        DancingEvening dancingEvening1 = new DancingEvening(1, "Potancowka", "12.09.2022", "20:00", "22:00", "USA",
                new String[]{"baloniki", "lampki"});
        DancingEvening dancingEvening2 = new DancingEvening(2, "NowyRok", "31.12.2023", "20:00", "01:00", "Party",
                new String[]{"ognie", "lampki"});
//
//
        DJOnDancingEvening DjOnEvening = new DJOnDancingEvening(new String[]{"dancing in the clouds", "listening to your heartbeat"}, 4, DJMarian, dancingEvening1);
        DJOnDancingEvening DjOnEvening2 = new DJOnDancingEvening(new String[]{"dancing in the clouds", "listening to your heartbeat"}, 40, DJMarian, dancingEvening2);
//
//        System.out.println("DJ MARIAN EVENINGS: ");
//        DJMarian.showDancingEvenings();
//        System.out.println("DANCING EVENING1 DJS: ");
//        dancingEvening1.showDJs();
//
//        System.out.println("============KWALIFIKOWANA============");
        Movie movie1 = new Movie("Big Lebowski", 6.8, 142.23, 1);
        Movie movie2 = new Movie("Big Bang", 6.2, 112.23, 2);
//
        MovieNight movieNight1 = new MovieNight(1, "Big Movie Night", "19.01.2022", "19:00", "24:00", "Money", "Movies about making money");
//
        movie1.addMovieNight(movieNight1);
        movie2.addMovieNight(movieNight1);
//        System.out.println(movieNight1.findMovieByID(2));
//
//        System.out.println("============KOPMPOZYCJA============");
        DJ DJKalina = new DJ("10.02.1991", "1002199100933", 1, "Kalina", "Prosota", "Music Inc.", "Kalyna", DJType.UNKNOWN);
        Contract contract1 = Contract.createContract("21.02.2023", "2 gigs", DJKalina);
        Contract contract2 = Contract.createContract("21.02.2024", "3 gigs", DJKalina);
//
//        System.out.println("DJKALINA'S CONTRACTS: " + DJKalina.getContracts());


        System.out.println("============ABSTRAKCJA============");
        waiter2.countPayments();
        barman1.countPayments();

        DJKalina.doWork();
        barman2.doWork();

        System.out.println("============OVERLAPPING============");
//        DJKalina.setUnknown();
//        DJKalina.setNumberOfFans(2000);
        DJKalina.setNumberOfFans(200);
//        DJKalina.setFamous(500);
        DJKalina.setFamous(2000);
//        DJKalina.setYearsOfExperience(2);
        DJKalina.setExperienced(2);
        DJKalina.setYearsOfExperience(3);
//        DJKalina.setUnknown(2000);
        DJKalina.setUnknown(500);


        System.out.println("============MULTI-INHERITANCE============");
        barman2.mixDrinks();
        barman1.receivePayment();

        System.out.println("============MULTI-ASPECT============");
        waiter1.doWork();

        System.out.println("============DYNAMIC============");
//        RetiredEmployee retiredEmployee1 = new RetiredEmployee(barman1.getBirthDate(), barman1.getPESEL(), barman1.getSalary(),
//                barman1.getStartDate(), barman1.getWeeksWorked(), barman1.getId(), barman1.getFirstName(), barman1.getLastName());
        RetiredEmployee retiredEmployee1 = retire(waiter1);
        retiredEmployee1.doWork();
        retiredEmployee1.countPayments();

    }

    public static RetiredEmployee retire(PermanentEmployee employee) {
        RetiredEmployee retiredEmployee = new RetiredEmployee(employee.getBirthDate(), employee.getPESEL(), employee.getSalary(),
                employee.getStartDate(), employee.getWeeksWorked(), employee.getId(), employee.getFirstName(), employee.getLastName());
        employee = null;
        return retiredEmployee;
    }
}