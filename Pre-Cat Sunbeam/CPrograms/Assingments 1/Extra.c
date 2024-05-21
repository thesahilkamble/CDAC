#include<stdio.h>
int main(){
    float temp;
    char ch;
    printf("Enter temperature:");
    scanf("%f",&temp);
    printf("You want to convert the temp in degree celcius? [y/n]:");
    scanf("%*c%c",&ch);
    printf("%c",ch);
}
