package hncdev;

import java.util.List;

public class NetworkFormation {

    public static int maximumNetworks(List<Integer> speed, int minComps, long speedThreshold) {
        int n = speed.size();
        int count = 0;

        for (int i = 0; i <= n - minComps; i++) {
            long sum = 0;
            int comps = 0;

            while(i < n && comps < minComps) {
                sum += speed.get(i);
                comps++;
                i++;
            }

            while(i < n && sum < speedThreshold) {
                sum += speed.get(i);
                comps++;
                i++;
            }

            if (sum >= speedThreshold && comps >= minComps) {
                count++;
            }
        }
        return count;
    }
}
