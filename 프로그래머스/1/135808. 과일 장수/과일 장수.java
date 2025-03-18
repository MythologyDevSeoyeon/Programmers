import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int n = score.length;
        int maxProfit = 0;

        for (int i = n - m; i >= 0; i -= m) {
            int p = score[i];
            maxProfit += p * m;
        }
        
        return maxProfit;
    }
}