package com.company;

public class carChallenge {
    public static void main (String [] args) {
        Car myCar = new Car ( "Tim's Car");
        Car anotherCar = new Car ("The Batmobile");
        myCar.accelerate (5);
        myCar.accelerate (30);
        myCar.brake (4);
        anotherCar.brake (15);
    }
}

class Car {
    private int speed = 0;
    private String name;

    public Car (String carName) {
        name = carName;
    }
    public void accelerate (int amount) {
        speed += amount; // speed = speed + amount
        showSpeed();
    }
    public void brake (int speedReduction) {
        speed -= speedReduction;

        if ( speed < 0)
            speed = 0;

        showSpeed();
    }
    public void showSpeed() {
        System.out.printf(" %s is going %d miles per hour. %n", name, speed);
    }

}
