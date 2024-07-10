

#include<iostream>
using namespace std;
int main()
{
	int n;
	int i;
	int j;
	cout<<"Enter a number : ";
	cin>>n;
	for(i=n;i>0;i--)
	{
		for(j=i;j>0;j--)
		{
			cout<<"*";
		}
	        cout<<endl;

	}
	return 0;
}
