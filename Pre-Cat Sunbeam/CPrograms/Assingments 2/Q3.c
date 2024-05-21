#include<stdio.h>

int main ()

{
    int num;

    printf("Enter the number: ");
    scanf("%d",&num);

    if (num>=0)
    {
        if (num==0)
        {
            printf("\nGiven number is zero");
        }
        
        else
        {

        printf("\nGiven number is positive");

        }
    }

    else
    {
        printf("\nGiven number is negative");

    }
    
}