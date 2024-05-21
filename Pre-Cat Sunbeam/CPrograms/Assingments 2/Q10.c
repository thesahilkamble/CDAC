#include<stdio.h>

char def(char c)
{
    if(65<=c>=90)
    printf("Entered character %c is an alphabet",c);
}

void main ()
{
    char c;
    printf("Enter a chacracter: ");
    scanf("%*c%c",&c);

    printf("\n%c",c);

}