#include<stdio.h>

int a;
int main ()
{
    printf("\nEnter Quantity: ");
    scanf("%d",&a);

    if(a>=30)
    {
        printf("You get a discount of %d",0.5*a);
    }

    else if (a>=50)
    {
        printf("You get a discount of %d",0.65*a);
    }
    else
    {
     printf("Gareeb tujhe discount chaiye");
    }
} 