package hncdev;

public class ScoreOfString {

    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String subString = s.substring(i, j);
                int subStringLength = subString.length();
                int subStringScore = 0;
                for (int k = 0; k < subStringLength; k++) {
                    subStringScore += subString.charAt(k) - 'a' + 1;
                }
                score += subStringScore;

            }
        }
        return score;
    }

    public static void main(String[] args) {
        ScoreOfString scoreOfString = new ScoreOfString();
        System.out.println(scoreOfString.scoreOfString("hello"));
    }
}


