package hncdev;

public class NumberOfGoodPairs {

    /*
    You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively.
    You are also given a positive integer k.
    A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).
    Return the total number of good pairs.
     */

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int counter = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs pairs = new NumberOfGoodPairs();
        int[] numbers1 = {1, 2, 4, 12};
        int[] numbers2 = {2, 4};

        int totalCount = pairs.numberOfPairs(numbers1, numbers2, 3);
        System.out.println(totalCount);
    }


}
