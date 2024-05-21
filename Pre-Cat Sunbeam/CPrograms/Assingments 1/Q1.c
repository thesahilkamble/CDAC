#include<stdio.h>

int main()
{

int num1;
int num2;

printf("Enter the numbers ");
scanf("%d%d", &num1 , &num2);

if (num1>num2)
{
    printf("\nSum of given numbers is %d \nDifference of given numbers %d \nProduct of given numbers is %d ",num1+num2,num1-num2,num1*num2 );
}

else
{
    printf("\nSum of given numbers is %d \nDifference of given numbers %d \nProduct of given numbers is %d ",num1+num2,num2-num1,num1*num2 );
}



// printf("\nSum of given numbers is %d", num1+num2);
// printf("\nDiff %d", num1-num2);
// printf("\nproduct %d", num1*num2);

}