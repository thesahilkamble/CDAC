#include<cmath>
#include<iostream>

using namespace std;

float circle (float radius)
{
	float result=3.14*radius*radius;
return result;
}

float rectangle(float SideA,float SideB)

{
	float result=SideA*SideB;
	return result;

}	

float square(float SideA)
{

	float result=SideA*SideA;
	return result;
}

int  main()

{
    int r,a,b,s;
    cout<<"Enter the radius for circle "<<endl;
    cin>>r;
    cout<<"Enter the length and breath for rectangle "<<endl;
    cin>>a;
    cin>>b;
    cout<<"Enter the lengh of side of square "<<endl;
    cin>>s;

float C=circle(r);
float R=rectangle(a,b);
float S=square(s);

cout<<C<<endl;
cout<<R<<endl;
cout<<S<<endl;

	return 0;

}