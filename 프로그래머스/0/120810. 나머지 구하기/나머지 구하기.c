#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = -1;
    int min = 0;
    int max = 100;
    
    if((min < num1 && num1 <= max)&&(min < num2 && num2 <= max)){
       int answer = num1 % num2;
        return answer;
    }
}