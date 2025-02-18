class Solution {
    public int solution(int a, int b, int n) {
        int totalCola = 0;
        while(n >= a){
            int exchangeCount = n / a;
            int newCola = exchangeCount * b;
            totalCola += newCola;
            n = (n % a) + newCola;
        }
        return totalCola;
    }
}