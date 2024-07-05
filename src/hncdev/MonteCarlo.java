package hncdev;

public class MonteCarlo {

    public static double estimatePi(int totalPoints) {
        double insidePoints = 0;
        for (int i = 0; i < totalPoints; i++) {
            double x = Math.random();
            double y = Math.random();

            if (x*x + y*y <= 1) {
                insidePoints++;
            }
        }
        return 4 * (insidePoints / (double) totalPoints);
    }

    public static void main(String[] args) {
        int totalPoints = 1000000;
        double PI = MonteCarlo.estimatePi(totalPoints);
        System.out.println("Here yours PI estimation: " + PI);
        System.out.println("Real PI: " + Math.PI);
    }
}
