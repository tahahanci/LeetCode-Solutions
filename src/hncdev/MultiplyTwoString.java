package hncdev;

public class MultiplyTwoString {

    public double multiplyString(String num1, String num2) {
        return Double.parseDouble(num1) * Double.parseDouble(num2);
    }

    public static void main(String[] args) {
        MultiplyTwoString multiplyTwoString = new MultiplyTwoString();
        System.out.println(multiplyTwoString.multiplyString("2", "3"));
    }
}
