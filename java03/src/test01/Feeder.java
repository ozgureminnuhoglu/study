package test01;

import java.util.Random;

public class Feeder {
    public int currentFood;
    public int foodEaten;

    public Feeder(int currentFood) {
        this.currentFood = currentFood;
    }

    public void simulateOneDay(int numBirds) {
        Random r = new Random();
        int food = r.nextInt(41);
        int food2 = 10 + food;
        foodEaten = numBirds * food2;

        if (foodEaten < currentFood) {
            currentFood = currentFood - foodEaten;
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
        System.out.println("foodEaten = " + foodEaten);
    }

    public int simulateManyDays(int numBirds, int numDays) {
        // ...
        int day = 1;
        while (day <= numDays) {
            this.simulateOneDay(numBirds);
            System.out.println(day + ".day :" + currentFood);
            day++;
            if (currentFood == 0) {
                break;
            }
        }

        return day;
    }
}
