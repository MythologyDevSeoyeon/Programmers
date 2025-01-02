#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = 0;
    int min = 0;
    int max = 10000;
    
    if((min < num1 && num1 <= max)&&(min < num1 && num1 <= max)){
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }
}