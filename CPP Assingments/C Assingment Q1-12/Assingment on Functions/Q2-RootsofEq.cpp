#include<cmath>
#include<iostream>
using namespace std;

int quad(int x,int y,int z)
{
	if (x==0)
		cout<<"Not a Quadratic Equation"<<endl;
      	float i=y*y-4*x*z;
	i=sqrt(i);

	if (i==0)
	{
	
	int result1=(-y+i)/2*x;

	cout<<"Roots are same"<<result1<<endl;

	}

	if (i>0)
	{

	int result1=(-y+i)/2*x;
	int result2=(-y-i)/2*x;

	cout<<"Roots are real and differnt \n"<<endl;
	cout<<result1<<endl;
	cout<<result2<<endl;
	}

	if (i<0)
	cout<<"Roots are imaginery and we don't have a code to find that, Sorry!"<<endl;

	return 0;
}


int main()
{
	int a,b,c;

	cout<<"Enter the coefficent of X^2 ";
	cin>>a;
	cout<<"Enter the coefficent of X ";
	cin>>b;
	cout<<"Enter the constant C ";
	cin>>c;

	quad(a,b,c);

	return 0;

}
