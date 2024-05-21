#include<iostream>
using namespace std;
int main()
{
	int n,temp,sum=0,r;
	cout<<"Enter a no:";
	cin>>n;

	temp=n;

	
	while(n>0)
	{
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}

	if (temp==sum)
		cout<<"No is armstrong";
	else
		cout<<"NOT armstrong";

	return 0;
}
