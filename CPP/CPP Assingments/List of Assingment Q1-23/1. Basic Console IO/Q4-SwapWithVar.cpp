#include<iostream>
using namespace std;
int main()

{
	int a,b;
	int temp=0;
	cout<<"Enter A:";
	cin>>a;
	cout<<"\nEnter B:";
	cin>>b;
	temp=a;
	a=b;
	b=temp;
	cout<<"A="<<a<<"And B="<<b;
	return 0;
}