package hncdev;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    /*
    This method removes duplicate characters from a string.
     */

    public String removeDuplicates(String str) {
        char ch[] = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        Set<Character> chHashSet = new HashSet<>();

        for (char c : ch) {
            if (chHashSet.add(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();
        String str = "hanci";
        System.out.println(rd.removeDuplicates(str));
    }
}
