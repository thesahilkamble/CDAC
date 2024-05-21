#include<stdio.h>

int main ()
{

int num,a,b,c,d,e;

printf("Enter your five digit number: ");
scanf("%d", &num);


a=num/10000;
b=(num-a*10000)/1000;
c=(num-a*10000-b*1000)/100;
d=(num-a*10000-b*1000-c*100)/10;
e=(num-a*10000-b*1000-c*100-d*10);

if (a==e&&b==d)
{
    printf("\nGiven number %d is palindrom number",num);
}

else
{
    printf("\nGiven number %d is not a palindrom number",num);
}

}