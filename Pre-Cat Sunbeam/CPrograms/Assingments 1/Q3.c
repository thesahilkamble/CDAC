#include<stdio.h>
#include<ctype.h>

int main()
{

char ch;

printf("Enter the character ");
scanf("%c",&ch);

if (isdigit(ch))
{
    
    printf("Charachter is %c", ch);
}

else

printf("ASCII value is %d", ch);

return 0;


} 