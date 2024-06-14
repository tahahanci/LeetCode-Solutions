package hncdev;

public class GoodPair {

    /*
    Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     */

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (num == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        GoodPair goodPair = new GoodPair();
        int[] nums = {1,2,3,1,1,3};
        int number = goodPair.numIdenticalPairs(nums);
        System.out.println(number);
    }
}
