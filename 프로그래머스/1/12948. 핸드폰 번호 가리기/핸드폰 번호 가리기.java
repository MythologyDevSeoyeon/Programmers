class Solution {
    public String solution(String phone_number) {
        int count = phone_number.length();
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < count - 4; i++){
            answer.append("*");
        }
        answer.append(phone_number.substring(count-4));
        
        
        return answer.toString();
    }
}