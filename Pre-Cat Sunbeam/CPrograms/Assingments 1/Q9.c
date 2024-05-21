#include<stdio.h>

int main()
{
    float temp,C,F;
    char Cel;
  
    printf("Enter the temp. to be converted ");
    scanf("%f", &temp);
    
    C=(9/5)*(temp-32);
    F=((temp*9/5)+32);

    printf("Do you wish to convert the temp in degree celcius? [y/n]");

    scanf("%*c%c", &Cel);
    

    if (Cel=='y')
    {
        printf("\nTemp in Degree Celcius %.3f",C);
    }
    
    else
    {
        printf("\nTemp in Fahereheit %.3f",F);
    }
    return 0;



}