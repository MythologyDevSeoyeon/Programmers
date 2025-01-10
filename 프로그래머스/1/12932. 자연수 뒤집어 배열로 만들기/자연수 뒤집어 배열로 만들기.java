class Solution {
    public long[] solution(long n) {
        int length = String.valueOf(n).length();
        long[] answer = new long[length];
        
        for(int i = 0; n > 0; i++){
        answer[i] = n % 10;
        n = n / 10;
        }
        
        return answer;
    }
}