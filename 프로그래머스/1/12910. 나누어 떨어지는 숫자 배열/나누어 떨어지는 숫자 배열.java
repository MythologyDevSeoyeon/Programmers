import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> results = new ArrayList<>();
        for(int element : arr){
            if(element % divisor == 0){
                results.add(element);
            }
        }
        
        if(results.isEmpty()){
            results.add(-1);
        } else{
          Collections.sort(results);  
        }
        
        int[] answer = new int [results.size()];
        for(int i = 0 ; i < results.size(); i++){
            answer[i] = results.get(i);
        }
        
        return answer;
    }
}