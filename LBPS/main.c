#include<stdio.h>

int main()
{
	
	int num1, num2,num3;
	double avg;
	printf("Enter three integers \n");
	scanf("%d",&num1);
    scanf("%d",&num2);
    scanf("%d",&num3);

	avg = num1/3.0 + num2/3.0 + num3/3.0;

	printf("Average of %d, %d & %d = %0.2lf", num1,num2,num3,avg);
	
	return 0;   	

}