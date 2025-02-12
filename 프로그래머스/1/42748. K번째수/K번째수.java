import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for(int index = 0 ; index < commands.length; index++){
            int i = commands[index][0] - 1;
            int j = commands[index][1];
            int k = commands[index][2] - 1;
            
            int[]temp = Arrays.copyOfRange(array, i, j);
            Arrays.sort(temp);
            answer[index] = temp[k];
        }
        
        return answer;
    }
}