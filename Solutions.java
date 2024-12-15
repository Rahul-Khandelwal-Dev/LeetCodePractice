import Questions.*;

public class Solutions {
    public static void main(String args[]) {
        IPO ipo = new IPO();
        PatchingArray patchingArray = new PatchingArray();
        SumOfSquareNumbers sumOfSquareNumbers = new SumOfSquareNumbers();
        RomanToInteger romanToInteger = new RomanToInteger();
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        FirstOccuranceIndex firstOccuranceIndex = new FirstOccuranceIndex();
        ReverseWord reverseWord = new ReverseWord();
        MaxAvgPassRatio solver = new MaxAvgPassRatio();
        int[][] classes = {{1, 2}, {3, 5}, {2, 2}};
        int extraStudents = 2;
        double result = solver.maxAverageRatio(classes, extraStudents);
        System.out.println("Solutions");
        System.out.println("502) IPO" + ipo.findMaximizedCapital(2,0, new int[]{1, 2, 3}, new int[]{0, 1, 1}));
        System.out.println("330) Patching Array" + patchingArray.minPatches( new int[]{1,3}, 6));
        System.out.println("633) Sum of square numbers" + sumOfSquareNumbers.judgeSquareSum2( 5));
        System.out.println("13) Roman to Integer" + romanToInteger.romanToInt( "MCMXCIV"));
        System.out.println("58) Length of Last Word" + lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("14) Longest Common Prefix" + longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println("28) Find the Index of the First Occurrence in a String" + firstOccuranceIndex.strStr("hello", "ll"));
        System.out.println("151) Reverse Words in a String" + reverseWord.reverseWords("  hello world  "));
        System.out.println("1792) Maximum Average Pass Ratio" + solver.maxAverageRatio(classes, extraStudents));
    }
}
