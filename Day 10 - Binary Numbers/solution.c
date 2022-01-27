#include<stdio.h>

int main(){
    int N;
    scanf("%d", &N);
    int sum = 0, max = 0;
    while(N>0){
        if(N%2==1){
            sum++;
            if(sum > max){
                max = sum;
            }
        }else{
            sum = 0;
        }
        N /= 2;
    }
    printf("%d",max);
    return 0;
}
