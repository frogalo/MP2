import Emloyees.*;
import Events.*;
import Objects.*;
import Emloyees.DJType;


public class Main {
    public static void main(String[] args) throws Exception {


        Barman barman1 = new Barman("10.01.1999", "0101199911123", 4999.99, 1,
                "10.02.2022", 31, 3, "Jan", "Kowlaski", false);

        Barman barman2 = new Barman("10.01.1998", "0101199811124", 3999.99, 2,
                "10.02.2021", 81, 8, "Marta", "Podmiecka", false);

        Waiter waiter1 = new Waiter("10.05.2022", "1005202234565", 3000, "20.01.2022",
                24, 3, "Jan", "Kowalik", new String[]{"polski", "francuski", "angielski"}, false);

        Waiter waiter2 = new Waiter("10.07.2022", "1005202232565", 3230, "20.01.2022",
                24, 4, "Kazimierz", "Baran", new String[]{"polski", "angielski"}, false);

        Birthday birthday1 = new Birthday(5, "20-Janusza", "02.02.2020", "20:00", "24:00", Cake.CHEESECAKE,
                "Janusz", 20, 100, EventType.FUN);
        Birthday birthday2 = new Birthday(6, "24-Marka", "03.02.2020", "20:00", "24:00", Cake.CHOCOLATE,
                "Marek", 24, 50, EventType.INTERESTING);

//        System.out.println("============MP2============");
//        System.out.println("============ZWYKLA============");
//        birthday1.addWaiter(waiter1);
//        waiter2.addBirthday(birthday2);
//        waiter2.addBirthday(birthday1);
//        System.out.println("WAITER 1:   " + waiter1.getBirthdays());
//        waiter2.writeBirthdays();
//        System.out.println("BIRTHDAY 1: " + birthday1.getWaiters());
//        System.out.println("BIRTHDAY 2: " + birthday2.getWaiters());
//
//
//        System.out.println("============Z ATRYBUTEM============");
        DJ DJMarian = new DJ("10.02.1997", "1002199700932", 7, "Marian", "Koszalek", "Music Inc.", "Marian", DJType.FAMOUS);

        DancingEvening dancingEvening1 = new DancingEvening(8, "Potancowka", "12.09.2022", "20:00", "22:00", "USA",
                new String[]{"baloniki", "lampki"}, EventType.FUN);
        DancingEvening dancingEvening2 = new DancingEvening(9, "NowyRok", "31.12.2023", "20:00", "01:00", "Party",
                new String[]{"ognie", "lampki"}, EventType.INTERESTING);
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
        MovieNight movieNight1 = new MovieNight(1, "Big Movie Night", "19.01.2022", "19:00",
                "24:00", "Money", "Movies about making money", EventType.FUN);
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

        System.out.println("============MP3============");
        System.out.println("============ABSTRAKCJA============");
        waiter2.countPayments(); //waiter is a permanent Employee
        barman1.countPayments(); //barman is also a permanent Employee

        DJKalina.doWork();
        barman2.doWork();

        System.out.println("============OVERLAPPING============");
//        DJKalina.makeUnknown();
//        DJKalina.setNumberOfFans(2000);
//        DJKalina.setNumberOfFans(200);
        DJKalina.makeFamous(5000);
//        DJKalina.makeFamous(2000);
//        DJKalina.setYearsOfExperience(2);
//        DJKalina.setNumberOfFans(10000);
//        DJKalina.setNumberOfFans(100);
        DJKalina.makeExperienced(3);
//        DJKalina.setYearsOfExperience(3);
//        DJKalina.makeUnknown(20000);
//        DJKalina.makeUnknown(500);


        System.out.println("============MULTI-INHERITANCE============");
        barman2.mixDrinks(); //can work as a bartender
        barman1.receivePayment(); //can work as a cashier

        System.out.println("============MULTI-ASPECT============");
        birthday1.makeInteresting();

        System.out.println("============DYNAMIC============");
        RetiredEmployee retiredEmployee1 = new RetiredEmployee(barman1.getBirthDate(), barman1.getPESEL(), barman1.getSalary(),
                barman1.getStartDate(), barman1.getWeeksWorked(), barman1.getId(), barman1.getFirstName(), barman1.getLastName());
//        RetiredEmployee retiredEmployee1 = retire(waiter1); //waiter can retire and become a retired employee
        retiredEmployee1.doWork();
        retiredEmployee1.countPayments();

/*

        System.out.println("============MP4============");

        System.out.println("============ARGUMENT============");
        birthday1.setNumberOfGuests(10);
//        Birthday birthday3 = new Birthday(2, "24-Marka", "03.02.2020", "20:00", "24:00", Cake.CHOCOLATE,
//                "Marek", 24, 500);
//        birthday1.setNumberOfGuests(200);

        System.out.println("============UNIQUE============");
        Table table1 = new Table(1, 23);
        Table table2 = new Table(2, 23);
        Table table3 = new Table(1, 23);

        waiter1.addTable(table1);
        waiter1.addTable(table2);
//        waiter1.addTable(table3);
        waiter1.showTables();

        System.out.println("============SUBSET============");
        DJGroup group1 = new DJGroup("sub1Group", "metal");
        group1.addDJ(DJKalina);
        group1.setLeadDJ(DJKalina);
//        group1.setLeadDJ(DJMarian);
        group1.showGroupMembers();


        System.out.println("============ORDERED============");
        DJConsole djConsole1 = new DJConsole("Trax2000", 201);
        DJKalina.addConsole(djConsole1);
        djConsole1.addDJ(DJMarian);

//        djConsole1.addDJ(DJMarian);
//        DJKalina.addConsole(djConsole1);

        System.out.println(djConsole1.getDjs());

        System.out.println("============BAG============");
        Room room1 = new Room(2, 124.14);
//        Reservation reservation1 = new Reservation(LocalTime.NOON, 2,dancingEvening1,room1)
*/


    }

    public static RetiredEmployee retire(PermanentEmployee employee) throws Exception {
        RetiredEmployee retiredEmployee = new RetiredEmployee(employee.getBirthDate(), employee.getPESEL(), employee.getSalary(),
                employee.getStartDate(), employee.getWeeksWorked(), employee.getId(), employee.getFirstName(), employee.getLastName());
        employee = null;
        return retiredEmployee;
    }
}