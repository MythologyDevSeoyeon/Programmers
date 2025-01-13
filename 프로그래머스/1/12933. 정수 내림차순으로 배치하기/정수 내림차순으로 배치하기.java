import java.util.Arrays;


class Solution {
    public long solution(long n) {
        
        String str = Long.toString(n);
        char[] digits = str.toCharArray();
        Arrays.sort(digits);
        
        StringBuilder sortedDigits = new StringBuilder(new String(digits)).reverse();
        
        return Long.parseLong(sortedDigits.toString());
    }
}