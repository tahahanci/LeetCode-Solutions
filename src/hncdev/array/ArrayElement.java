package hncdev.array;

public class ArrayElement {

    /*
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the
    elements may be changed. Then return the number of elements in nums which are not equal to val.
    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the
    following things:
    Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
    The remaining elements of nums are not important as well as the size of nums.
    Return k.
     */

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        ArrayElement arrayElement = new ArrayElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = arrayElement.removeElement(nums, val);
        System.out.println(result);
    }
}
