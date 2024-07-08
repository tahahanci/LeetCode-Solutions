package hncdev;

import java.util.Scanner;

public class MonteCarlo {

    public static double estimatePi(int totalPoints) {
        int insidePoints = 0;
        for (int i = 0; i < totalPoints; i++) {
            double x = Math.random();
            double y = Math.random();

            if (x*x + y*y <= 1) {
                insidePoints++;
            }
        }
        return 4 * ((double) insidePoints / (double) totalPoints);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give the total points for estimating PI: ");
        int totalPoints = input.nextInt();
        double PI = MonteCarlo.estimatePi(totalPoints);

        System.out.println("Here yours PI estimation: " + PI);
        System.out.println("Real PI: " + Math.PI);
    }
}
