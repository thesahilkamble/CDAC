#include<stdio.h>

int add(int a,int b)
{
	return a+b;
}

int substract(int a,int b)
{
	return a-b;
}
int main()
{
	int (*p)(int,int);
	p= add;
	int k = p(20,10);
	cout<<"\n value=" <<k;
	
	p= substract;
	k = p(20,10);
	cout<<"\n value="<<k;
	return 0;
}
