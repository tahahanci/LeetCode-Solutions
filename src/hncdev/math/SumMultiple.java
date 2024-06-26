package hncdev.math;

public class SumMultiple {

    public int sumOfMultiples(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 | i % 5 == 0 | i % 7 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        SumMultiple multiple = new SumMultiple();
        int sum = multiple.sumOfMultiples(10);
        System.out.println(sum);
    }
}
