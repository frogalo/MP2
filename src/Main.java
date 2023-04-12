import Emloyees.Barman;
import Emloyees.DJ;
import Emloyees.DJOnDancingEvent;
import Emloyees.Waiter;
import Events.Birthday;
import Events.Cake;
import Events.DancingEvening;

public class Main {
    public static void main(String[] args) throws Exception {

        String[] certificates;
        Barman barman1 = new Barman("10.01.1999", "0101199911123", 3999.99, 1,
                "10.02.2022", 31, 3, new int[]{1, 2}, "Jan", "Kowlaski");

        Barman barman2 = new Barman("10.01.1998", "0101199811124", 3999.99, 2,
                "10.02.2021", 81, 8, new int[]{2}, "Marta", "Podmiecka");

        Birthday birthday1 = new Birthday(1, "20-Janusza", "02.02.2020", "20:00", "24:00", Cake.CHEESECAKE,
                "Janusz", 20, new int[]{1, 2});
        Birthday birthday2 = new Birthday(2, "24-Marka", "03.02.2020", "20:00", "24:00", Cake.CHOCOLATE,
                "Marek", 24, new int[]{2});


//        for (int i = 0; i < birthday1.barmanIds.length; i++) {
//            try {
//                System.out.println(Barman.findBarman(birthday1.barmanIds[i]));
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }

        DJ DJMarian = new DJ("10.02.1997", "1002199700932", 1, "Marian", "Koszalek", "Music Inc.", "Marian");

        DancingEvening dancingEvening1 = new DancingEvening(1, "Potancowka", "12.09.2022", "20:00", "22:00", "USA",
                new String[]{"baloniki", "lampki"}, 1);


        DJOnDancingEvent DjOnEvent1 = new DJOnDancingEvent(new int[]{1}, new int[]{1}, new String[]{"dancing in the clouds", "listening to your heartbeat"}, 4);

        Waiter waiter1 = new Waiter("10.05.2022", "1005202234565", 3000, "20.01.2022",
                24, 1, "Jan", "Kowalik", new String[]{"polski", "francuski", "angielski"});






    }
}