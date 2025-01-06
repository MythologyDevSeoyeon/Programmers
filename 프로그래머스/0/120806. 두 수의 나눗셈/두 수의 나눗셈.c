#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int min = 0;
    int max = 100;
    
    if((min < num1 && num1 <= max) && (min < num2) && (num2 <= max)){
        double answer = (double) num1/num2;
        answer = answer * 1000;
        return (int) answer;
    } else {
        return 0;
    }
}