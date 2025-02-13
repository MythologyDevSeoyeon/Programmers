import java.util.*;
class Solution {
    public int[] solution(String s) {

        int [] answer = new int [s.length()];
        HashMap<Character, Integer> indexMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(indexMap.containsKey(currentChar)){
                answer[i] = i - indexMap.get(currentChar);
            } else {
                answer[i] = - 1;
            }
            indexMap.put(currentChar,i);
        }
        
        return answer;
    }
}