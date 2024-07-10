#include<iostream>
using namespace std;
int main()
{
	int r,c;
	
	cout<<"Enter rows:";
	cin>>r;
	cout<<"Enter cols:";
	cin>>c;

	int i,j;
	for(i=0 ; i<c ; i++)
	{
		for(j=0 ; j<r ; j++)
		{
			if(i==0 || i==c-1 || j==0 || j==r-1)
			cout<<"* ";

			else
			cout<<"  ";	
		}
		cout<<endl;
	}
	return 0;
}

