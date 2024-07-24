package hncdev.math;

public class HarshadNumber {

    public int sumDigitsOfHarshadNumber(int x) {
        int myNumber = x;
        int sum = 0;

        while (myNumber > 0) {
            sum += (myNumber % 10);
            myNumber /= 10;
        }

        if (x % sum == 0)
            return sum;
        else
            return -1;
    }

    public static void main(String[] args) {
        HarshadNumber harshadNumber = new HarshadNumber();
        int myNumber = harshadNumber.sumDigitsOfHarshadNumber(23);
        System.out.println(myNumber);
    }
}
