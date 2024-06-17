package Questions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result =0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i =0 ; i< n; i++) {
            int currentValue = map.get(s.charAt(i));
            if(i+1 < n && currentValue < map.get(s.charAt(i+1)))
            {
             result -= currentValue;
            }
            else {
                result += currentValue;
            }
        }
        return result;
    }
}
