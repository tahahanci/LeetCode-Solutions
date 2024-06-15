package hncdev;

import java.util.Arrays;

public class HighestAltitude {

    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;
        for (int i = 1; i < altitudes.length; i++) {
            altitudes[i] = gain[i - 1] + altitudes[i - 1];
        }
        return Arrays.stream(altitudes).max().getAsInt();
    }

//    public int largestAltitude(int[] gain) {
//        int currentAltitude = 0;
//        int maxAltitude = 0;
//        for (int i = 0; i < gain.length; i++) {
//            currentAltitude += gain[i];
//            if (currentAltitude > maxAltitude) {
//                maxAltitude = currentAltitude;
//            }
//        }
//        return maxAltitude;
//    }

    public static void main(String[] args) {
        HighestAltitude highestAltitude = new HighestAltitude();
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int max = highestAltitude.largestAltitude(gain);
        System.out.println(max);
    }
}
