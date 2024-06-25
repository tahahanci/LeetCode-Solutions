package hncdev;

public class FindMaximum {

    public int findMax(int[] numbers) {
        int maximum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (maximum < numbers[i])
                maximum = numbers[i];
        }
        return maximum;
    }

    public static void main(String[] args) {
        FindMaximum findMaximum = new FindMaximum();
        int[] myArray = {1, 2, 3, 4, 5, 6};
        int maxNumber = findMaximum.findMax(myArray);
        System.out.println(maxNumber);
    }
}
