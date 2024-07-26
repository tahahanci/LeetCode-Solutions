package hncdev.math;

import java.util.Arrays;

public class EncryptedInteger {

    /*
    You are given an integer array nums containing positive integers. We define a function encrypt such that encrypt(x)
    replaces every digit in x with the largest digit in x. For example, encrypt(523) = 555 and encrypt(213) = 333.
    Return the sum of encrypted elements.
     */

    public int encrypt(int x) {
        int number = x;
        int counter = 0;
        int sum = 0;
        while (number > 0) {
            number /= 10;
            ++counter;
        }

        int[] remainder = new int[counter];
        for (int i = 0; i < remainder.length; i++) {
            remainder[i] = x % 10;
            x /= 10;
        }
        Arrays.sort(remainder);
        int multiply = 1;
        for (int i = counter - 1; i >= 0; i--) {
            sum += (remainder[counter - 1] * multiply);
            multiply *= 10;
        }
        return sum;
    }

    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += encrypt(num);
        }
        return sum;
    }

    public static void main(String[] args) {
        EncryptedInteger integer = new EncryptedInteger();
        int[] myArray = {999, 87};
        int sum = integer.sumOfEncryptedInt(myArray);
        System.out.print(sum);
    }
}
