#include<stdio.h>

int main()
{
    int num,a,b,c,d;

    printf("Enter a four digit number: ");
    scanf("%d",&num);

    a=num/1000;
    b=(num-a*1000)/100;
    c=(num-a*1000-b*100)/10;
    d=(num-a*1000-b*100-c*10);

    printf("%d\t%d\t%d\t%d",a,b,c,d);
    printf("\n%d + %d + %d + %d",a*1000,b*100,c*10,d);
    printf("\n%d%d%d%d",d,c,b,a);


}