class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int i : arr){
            sum += i;    
        }
        double avg = (double) sum / arr.length;
        return avg;
    }
}