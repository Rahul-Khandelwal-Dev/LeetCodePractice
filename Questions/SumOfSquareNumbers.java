package Questions;

public class SumOfSquareNumbers {

    /*
    Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.



Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false
    */
    // This solution false with time exceeded error
    public boolean judgeSquareSum(int c) {
        for(int a = 0; a*a < c; a++) {
            int b = c - (a*a);
            if(isPerfectSquare(b)) {
                return true;
            }
        }
        return false;
    }

    // This solution works for every testcase
    public boolean judgeSquareSum2(int c) {
        if(c == 0) {
            return true;
        }
        for(long a = 0; a*a < c; a++) {
            double b = Math.sqrt(c - (a*a));
            if(b == (int)b) {
                return true;
            }
        }
        return false;
    }

    public boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}