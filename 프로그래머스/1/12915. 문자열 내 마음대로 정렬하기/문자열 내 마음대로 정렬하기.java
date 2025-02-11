import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (s1,s2) -> {
            char char1 = s1.charAt(n);
            char char2 = s2.charAt(n);
                  
            if(char1 == char2){
                return s1.compareTo(s2);
            } else {
                return char1 - char2;
            }
                 
        });
        
        return strings;
        
    }
}