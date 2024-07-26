package hncdev.array;

import java.util.Arrays;

public class ArraySorting {

    public int[] sortArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        ArraySorting sorting = new ArraySorting();
        int[] nums = {1, 4, 2, 7, 9};
        nums = sorting.sortArray(nums);
        System.out.print(Arrays.toString(nums));
    }
}
