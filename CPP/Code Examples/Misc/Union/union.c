#include<stdio.h>
union Number
{
	int i;
	long l;
	double d;
};


int main()
{
	union Number n;
	printf("\n Int size=%d",sizeof(int));
	printf("\n Long size=%d",sizeof(long));
	printf("\n Double size=%d",sizeof(double));
	printf("\n size=%d",sizeof(n));
	n.d= 10.10;
	printf("\n Int=%d",n.i);
	printf("\n Double=%lf",n.d);
	
	return 0;
}