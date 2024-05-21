#include<stdio.h>

int def();
int wlp();
int a;
int main ()
{
    printf("\nGive input for year: ");
    scanf("%d",&a);

    wlp(a);
} 

// int def(int a)
// {

//     if(a%4==0)
//     {
//     printf("\nGiven year %d is a leap year",a);
//     }

//     else if (a%400==0)
//     {
//     printf("\nGiven year %d is a leap year",a);
//     }

//     else
//     {
//         printf("\nGiven year %d is not a leap year",a);

//     }
    

int wlp(int a)
{
        if(a%4==0||a%400)
    {
        printf("\nGiven year %d is a leap year",a);
    }

    else
    {
        printf("\nGiven year %d is not a leap year",a);

    }
    

    }
