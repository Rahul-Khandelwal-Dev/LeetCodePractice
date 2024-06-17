package Questions;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        int length = split.length;
        String lastWord = split[length - 1];
        return lastWord.length();
    }
}
