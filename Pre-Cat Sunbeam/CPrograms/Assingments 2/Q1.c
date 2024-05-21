#include<stdio.h>

int main ()
{

float a,b;

printf("Enter two numbers: ");
scanf("%f%f",&a,&b);

if(b==0)
{
    printf("\nError, can not divide by zero");
}

else
{
    printf("\nDivision is %f",a/b);
}

}