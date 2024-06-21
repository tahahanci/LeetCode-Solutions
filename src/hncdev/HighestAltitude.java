package hncdev;

import java.util.Arrays;

public class HighestAltitude {

    /*
    There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
    The biker starts his trip on point 0 with altitude equal 0.
    You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1
    for all (0 <= i < n). Return the highest altitude of a point.
     */

//    public int largestAltitude(int[] gain) {
//        int[] altitudes = new int[gain.length + 1];
//        altitudes[0] = 0;
//        for (int i = 1; i < altitudes.length; i++) {
//            altitudes[i] = gain[i - 1] + altitudes[i - 1];
//        }
//        return Arrays.stream(altitudes).max().getAsInt();
//    }

    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        HighestAltitude highestAltitude = new HighestAltitude();
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int max = highestAltitude.largestAltitude(gain);
        System.out.println(max);
    }
}
