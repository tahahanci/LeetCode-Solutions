package hncdev;

public class SumDifference {

    /*
    You are given positive integers n and m. Define two integers, num1 and num2, as follows:

    num1: The sum of all integers in the range [1, n] that are not divisible by m.
    num2: The sum of all integers in the range [1, n] that are divisible by m.

    Return the integer num1 - num2.
     */

    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i <= n; i++) {
            if (i % m != 0) {
                num1 += i;
            } else {
                num2 += i;
            }
        }

        return num1 - num2;
    }

    public static void main(String[] args) {
        SumDifference difference = new SumDifference();
        int totalDifference = difference.differenceOfSums(10, 3);
        System.out.println(totalDifference);
    }
}
