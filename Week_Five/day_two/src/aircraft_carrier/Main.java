package aircraft_carrier;

public class Main {
    public static void main(String[] args) {
        Carrier helicarrier = new Carrier(23000, 1000);
        Carrier megKiller = new Carrier(23000, 1000);

        int numberOfAircraft = 4;

        for (int i = 0; i < numberOfAircraft; i++) {
            helicarrier.add(new F16());
            megKiller.add(new F35());
        }

        while (helicarrier.healthPoints > 0 && megKiller.healthPoints > 0 ){

            helicarrier.fill();
            megKiller.fill();

            System.out.println(helicarrier.getStatus());
            System.out.println(megKiller.getStatus());

            helicarrier.fight(megKiller);
            megKiller.fight(helicarrier);

            System.out.println(helicarrier.getStatus());
            System.out.println(megKiller.getStatus());

        }
    }
}
