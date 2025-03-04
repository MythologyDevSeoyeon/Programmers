import java.util.*;
    
class Solution {
    public int[] solution(int k, int[] scores) {
        List<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
        
        for(int score : scores){
            hallOfFame.add(score);
            if(hallOfFame.size() > k){
                hallOfFame.poll();
            }
            answer.add(hallOfFame.peek());
        }
        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}