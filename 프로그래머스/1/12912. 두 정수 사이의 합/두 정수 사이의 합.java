class Solution {
    public long solution(int a, int b) {
        
        int start = Math.min(a,b);
        int end = Math.max(a,b);
        
        long answer = (long) (start + end) * (end - start +1) / 2;
        
        return answer;
    }
}