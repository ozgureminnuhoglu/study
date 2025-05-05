class Car {
    String model;
    int speed;

    // Constructor
    public Car(String carModel, int carSpeed) {
        this.model = carModel;
        this.speed = carSpeed;  // Start with speed 0
    }

    // Instance method to accelerate
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(model + " is now going at " + speed + " mph.");
    }

    // Instance method that calls accelerate
    public void startDriving() {
        System.out.println(model + " is starting to move!");
        accelerate(50);  // Calls the accelerate method
    }
}

public class LearnJava5 {
    public static void main(String[] args) {
        Car myCar = new Car("mercedes",120);
        myCar.startDriving();  // Output: Toyota is starting to move!
        //         Toyota is now going at 20 mph.
    }
}
