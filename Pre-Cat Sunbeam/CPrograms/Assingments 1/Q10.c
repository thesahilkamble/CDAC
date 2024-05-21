#include<stdio.h>
#include<math.h>

int main()
{
    int a,b,c;


printf("Enter length of side A ");
scanf("%d",&a);

printf("Enter length of side B ");
scanf("%d",&b);

printf("Enter length of side C ");
scanf("%d",&c);

printf("\nPerimeter of given traingle is %d",a+b+c);

int s=((a+b+c)/2);

int Area=sqrt((s)*(s-a)*(s-b)*(s-c));

printf("\nArea of the given triangle is %d", Area);

}
