package Questions;

public class FirstOccuranceIndex {
    public int strStr(String haystack, String needle) {
        int indexOf = haystack.indexOf(needle);
        if(indexOf < 0){
            return -1;
        }
        return indexOf;
    }
}
