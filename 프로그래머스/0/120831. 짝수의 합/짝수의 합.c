#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    
    int sum = 0;
    for(int i = 2; i <= n ; i += 2){
        sum += i;
    }
    return sum;
}