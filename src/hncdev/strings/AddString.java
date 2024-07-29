package hncdev.strings;

public class AddString {

    public String addString(String num1, String num2) {
        int total = stringToInteger(num1) + stringToInteger(num2);
        return String.valueOf(total);
    }

    private int stringToInteger(String num1) {
        int result = 0;
        int sign = 1;

        for (int i = 0; i < num1.length(); i++) {
            char c = num1.charAt(i);
            if (c == -1) {
                sign = -1;
            } else {
                int digit = c - '0';
                result = (result * 10) + digit;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        AddString reference = new AddString();
        String total = reference.addString("102", "101");
        System.out.println(total);

        String num1 = "0";
        String num2 = "5";
        total = reference.addString(num1, num2);
        System.out.println(total);
    }
}
