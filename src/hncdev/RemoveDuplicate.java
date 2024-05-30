package hncdev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    /*
    This method removes duplicate characters from a string.
     */

    public String removeDuplicates(String str) {
        return Arrays.asList(str.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();
        String str = "hello";
        System.out.println(rd.removeDuplicates(str));
    }
}
