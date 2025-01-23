import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        
        for(int num : arr){
            if(num < min) {
                min = num;
            }
        }
        
        for(int num : arr){
            if(num != min){
                answer.add(num);
            }
        }
        
        if(answer.size() == 0){
            answer.add(-1);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}