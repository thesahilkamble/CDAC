// First.cpp : Defines the entry point for the console application.
#include<iostream>
using namespace std;

template<class T>
void Swap(T& a,T& b)
	{
		T temp;
		temp=a;
		a= b;
		b=temp;

	}

int main()
{
	cout<<"\n Swapping program"<<endl;
	float i = 20.20F;
	float j = 40.20F;

	Swap(i,j);
	cout<<"\n I="<<i;
	cout<<"\n J="<<j;


	return 0;
}
