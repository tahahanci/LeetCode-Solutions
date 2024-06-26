package hncdev.math;

public class SmallestEvenMultiple {

    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0)
            return n;
        else
            return n * 2;
    }

    public static void main(String[] args) {
        SmallestEvenMultiple smallestEvenMultiple = new SmallestEvenMultiple();
        int smallest = smallestEvenMultiple.smallestEvenMultiple(6);
        System.out.println(smallest);
    }
}
