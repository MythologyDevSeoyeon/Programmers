class Solution {
    public String solution(String[] seoul) {
        for(int i = 0; i < seoul.length; i++){
            if("Kim".equals(seoul[i])){
            String location = integer.toString(i);
            return location;
            }
        }
        return "김서방은" + location + "에 있다";
    }
}