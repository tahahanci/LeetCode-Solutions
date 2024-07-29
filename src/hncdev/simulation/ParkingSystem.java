package hncdev.simulation;

/*
 * Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small,
 * with a fixed number of slots for each size.
 * Implement the ParkingSystem class:
 * ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class. The number of slots for
 * each parking space are given as part of the constructor.
 * bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the
 * parking lot. carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively.
 * A car can only park in a parking space of its carType. If there is no space available, return false, else park
 * the car in that size space and return true.
 */

public class ParkingSystem {

    int small;
    int medium;
    int big;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (small > 0 & carType == 3) {
            small--;
            return true;
        } else if (medium > 0 & carType == 2) {
            medium--;
            return true;
        } else if (big > 0 & carType == 1) {
            big--;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        boolean b1 = parkingSystem.addCar(1);
        boolean b2 = parkingSystem.addCar(1);

        System.out.println(b1);
        System.out.println(b2);
    }
}
