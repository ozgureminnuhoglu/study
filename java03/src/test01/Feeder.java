package test01;

import java.util.Random;

public class Feeder {
    public int currentFood;
    public Feeder(int currentFood) {
        this.currentFood = currentFood;
    }
    public void simulateOneDay(int numBirds){
        Random r = new Random();
        int food = r.nextInt(41);
        int food2 = 10 + food;
        int totalFood = numBirds * food2;

        if (totalFood < currentFood) {
            currentFood = currentFood - totalFood;
        } else {
            currentFood = 0;
        }

        Random r2 = new Random();
        int r3 = r2.nextInt(101);
        boolean bear = false;
        if (r3 <= 5) {
            bear = true;
        }
        if (bear) {
            currentFood = 0;
        }
        System.out.println("bear = " + bear);
    }
    public int simulateManyDays(int numBirds, int numDays) {
        // ...
        return 0;
    }
}
