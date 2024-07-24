package hncdev;

public class ArrivalTime {

    /*
    You are given a positive integer arrivalTime denoting the arrival time of a train in hours, and another positive
    integer delayedTime denoting the amount of delay in hours. Return the time when the train will arrive at the station.
    Note that the time in this problem is in 24-hours format.
     */

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int actualArrivalTime = arrivalTime + delayedTime;

        if (actualArrivalTime >= 24) {
            return actualArrivalTime - 24;
        }

        return actualArrivalTime;
    }

    public static void main(String[] args) {
        ArrivalTime arrivalTime = new ArrivalTime();
        int time = arrivalTime.findDelayedArrivalTime(12, 8);
        System.out.println(time);
    }
}
