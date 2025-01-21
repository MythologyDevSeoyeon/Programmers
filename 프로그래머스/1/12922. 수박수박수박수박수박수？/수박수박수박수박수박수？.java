class Solution {
    public String solution(int n) {
        String pattern = "수박";
        StringBuilder answer = new StringBuilder();
        for(int i = 0 ; i < n; i++){
            answer.append(pattern);
        }
        answer.setLength(n); 
        return answer.toString();
        
    }
    
}