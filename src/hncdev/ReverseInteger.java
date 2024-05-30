package hncdev;

public class ReverseInteger {

    /*
    Given a signed 32-bit integer x, return x with its digits reversed.
    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.q
     */

    public int reverse(int x) {
        long reverse = 0;
        int unsignedNumber = x < 0 ? -1 : 1;

        x = Math.abs(x);

        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        reverse *= unsignedNumber;
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reverse;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(123));
        System.out.println(reverseInteger.reverse(-123));
        System.out.println(reverseInteger.reverse(120));
        System.out.println(reverseInteger.reverse(0));
        System.out.println(reverseInteger.reverse(1534236469));
    }
}
