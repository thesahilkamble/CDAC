

#include<iostream>
using namespace std;
int main()
{
	int n;
	int i;
	int j;
	int k;
	cout<<"Enter a number :";
	cin>>n;
	for(i=n;i>0;i--)
	{
		for(k=i-1;k>0;k--)
			cout<<" ";
		for(j=0;j<n-i+1;j++)
			cout<<"*";
		cout<<endl;
	}
	return 0;
}
