package hncdev;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers
    such that they add up to target.You may assume that each input would have exactly one
    solution, and you may not use the same element twice. You can return the answer in any
    order.
     */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberIndices = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numberIndices.containsKey(complement)) {
                return new int[]{numberIndices.get(complement), i};
            }
            numberIndices.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two number add up to the target");
    }

    public static void main(String[] args) {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        TwoNumberSum twoNumberSum = new TwoNumberSum();
        int[] myArray = twoNumberSum.twoSum(array, targetSum);
        System.out.println(Arrays.toString(myArray));
    }
}
