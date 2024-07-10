#include<iostream>
using namespace std;
int add( int a, int b = 0, int c =0)
{
	return a + b + c;
}
int add1( int a, int b, int)
{
	return a + b;
}
int add1( int a, int b)
{
	return a + b;
}
int main()
{
	cout<<add(10, 20)<<endl;
	cout<<add(add(10,20), 30)<<endl;
	cout<<add(10,20,30)<<endl;
	add1(30, 60);
	add1(30, 60,90);
	return 0;
}
