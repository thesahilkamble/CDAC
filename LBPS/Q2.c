#include<stdio.h>

int main()
{
    printf("Enter the two numbers to be swapped\n");
    int num1,num2;
    scanf("%d",&num1);
    scanf("%d",&num2);
    printf("Before Swap %d , %d \n",num1,num2);
    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
    printf("After Swap %d , %d",num1,num2);

}