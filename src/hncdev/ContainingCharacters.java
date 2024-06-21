package hncdev;

import java.util.ArrayList;
import java.util.List;

public class ContainingCharacters {

    /*
    You are given a 0-indexed array of strings words and a character x.
    Return an array of indices representing the words that contain the character x.
    Note that the returned array may be in any order.
     */

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int isExist = words[i].indexOf(x);
            if (isExist != -1)
                myList.add(i);
        }
        return myList;
    }

    public static void main(String[] args) {
        ContainingCharacters containingCharacters = new ContainingCharacters();
        String[] words1 = {"let", "code"};
        char x1 = 'e';
        System.out.println(containingCharacters.findWordsContaining(words1, x1));
    }
}
