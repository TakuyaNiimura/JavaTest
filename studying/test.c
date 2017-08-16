#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int add(int,int);
int sub(int,int);

int main(int argc, const char * argv[]){
    int a,b;
    int result;
    printf("a=");
    scanf("%d",&a);
    printf("b=");
    scanf("%d",&b);
    result = add(a,b);
    printf("%d+%d=%d\n",a,b,result);
    result = sub(a,b);
    printf("%d-%d=%d\n",a,b,result);
}

int add(int a, int b){
    return a+b;
}

int sub(int a, int b){
    return a-b;
}