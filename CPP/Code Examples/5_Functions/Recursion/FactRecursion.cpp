#include<stdio.h>
void fun(int);

int main()
{
    int a=3;
    int fact = factorial(a);
	cout<<"\n Factorial Value="<<fact;
    return 0;
}
int factorial(int no)
{
    if(n > 1)
    {
		return no * factorial(no-1);
    } else {
		return 1;
	}
}

