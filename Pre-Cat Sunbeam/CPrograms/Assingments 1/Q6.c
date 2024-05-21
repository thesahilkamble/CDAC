#include<stdio.h>

int main()
{

short int num;
int i=0;
int tab=1;

printf("Enter the number ");
scanf("%d",&num);

 for (i = 1; i <= 10; i++)
  {
    int tab=tab+1;
    printf("%d\n",num*tab);  
  }
  return 0;
}