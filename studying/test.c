#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include"calc.h"

int add(int,int);
int sub(int,int);

int main(int argc, const char * argv[]){
    double i = 1.2;
    double j = 2.4;
    double k = 0;

    k = avg(i,j);
    printf("%f",k);
}

int add(int a, int b){
    return a+b;
}

int sub(int a, int b){
    return a-b;
}