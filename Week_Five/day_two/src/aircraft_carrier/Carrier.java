package aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircraft> aircrafts;
    int storageOfAmmo;
    int healthPoints;

    public Carrier(int storeOfAmmo, int healthPoints)  {
        aircrafts = new ArrayList<>();
        this.storageOfAmmo = storeOfAmmo;
        this.healthPoints = healthPoints;
    }

    public void add(Aircraft aircraft)  {
        aircrafts.add(aircraft);
    }

    public void fill()  {
        if (storageOfAmmo == 0)  {
            throw new ArithmeticException( "We got nothing to do but run!" );
        }  else if (checkAmmoStorage())  {
            for (Aircraft aircraft : aircrafts) {
                storageOfAmmo = aircraft.refill(storageOfAmmo);
            }
        }  else {
            for (int i = 0; i < countPriorityAircrafts(); i++)  {
                storageOfAmmo = aircrafts.get(i).refill(storageOfAmmo);
            }
            if (storageOfAmmo != 0)  {
                for (Aircraft aircraft : aircrafts)  {
                    storageOfAmmo = aircraft.refill(storageOfAmmo);
                }
            }
        }
    }

    public int countPriorityAircrafts()  {
        int numberOfPriorityAircrafts = 0;
        for (Aircraft aircraft : aircrafts)  {
            if (aircraft.isPriority())  {
                numberOfPriorityAircrafts++;
            }
        } return numberOfPriorityAircrafts;
    }

    public boolean checkAmmoStorage() {
        int ammoNeeded = 0;
        for (Aircraft aircraft :
                aircrafts) {
            ammoNeeded += aircraft.maxAmmo - aircraft.ammoStore;
        }
        return ammoNeeded < storageOfAmmo;
    }

    public void fight(Carrier otherCarrier) {
        if (healthPoints > 0) {

            int totalDamage = 0;
            for (Aircraft aircraft :
                    aircrafts) {
                totalDamage += aircraft.fight();
            }
            otherCarrier.healthPoints -= totalDamage;
        } else {
            System.out.println("Rest in Peace");
        }
    }

    public int totalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft :
                aircrafts) {
            totalDamage += aircraft.allDamage();
        }
        return totalDamage;
    }

    public String getStatus() {
        if (healthPoints <= 0) {
            return "It's dead Stark :(";
        } else {

            String status = "HP: " + healthPoints + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + storageOfAmmo + ", Total damage: " + totalDamage();
            status += "\nAircrafts:\n";
            for (Aircraft aircraft :
                    aircrafts) {
                status += aircraft.getStatus() + "\n";
            }


            return status;
        }
    }
}

