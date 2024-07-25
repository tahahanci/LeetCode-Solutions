package hncdev.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public List<Integer> findPrimeDivisors(int number) {
        if (number <= 1)
            throw new IllegalArgumentException("The number must be greater than 1.");

        List<Integer> primeDivisors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                if (!primeDivisors.contains(i)) {
                    primeDivisors.add(i);
                }
                number /= i;
            }
        }
        return primeDivisors;
    }

    public void findDivisors(int number) {
        if (number < 0)
            throw new IllegalArgumentException("You cannot enter value less than 0.");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
