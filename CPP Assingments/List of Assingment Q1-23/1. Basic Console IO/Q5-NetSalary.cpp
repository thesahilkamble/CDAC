#include<iostream>
using namespace std;

int main()
{
	float BS, HRA, DA, GS;
	float PF, NS;
	cout<<"Enter Basic Salary";
	cin>>BS;

	HRA = 0.15*BS;
 
	DA = 0.30*BS;

	GS = BS + HRA + DA;

	PF = 0.125*GS;

	NS= GS - PF;

	cout<<"Net salary="<<NS;

	return 0;
	
}
