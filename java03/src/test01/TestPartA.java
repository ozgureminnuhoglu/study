package test01;

public class TestPartA {
    public static void main(String[] args) {
        Feeder f = new Feeder(500);
        f.simulateOneDay(12);
        System.out.println("f.currentFood = " + f.currentFood);

    }
}
