#include<iostream>
using namespace std;

int main()
{
	int a,b,c,d,e;
	cout<<"Enter marks of 5 subjects:";
	cin>>a>>b>>c>>d>>e;
	
	float avg;

	avg=(a+b+c+d+e)/5;

	cout<<"Average of 5 sub:"<<avg;

	return 0;
}
