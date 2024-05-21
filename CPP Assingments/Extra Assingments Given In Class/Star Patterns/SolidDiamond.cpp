#include <iostream>
using namespace std;

int main(){
	int n;
	int i,j,k;
	cout<<"Enter number"<<endl;
	cin>>n;
	for(i=n-1;i>=0;i--){
		for(j=0;j<i;j++)
			cout<<" ";
		for(k=0;k<n-i;k++)
			cout<<"* ";
		cout<<endl;
	}
	for(i=1;i<n;i++)
	{
		for(j=0;j<i;j++)
			cout<<" ";
		for(k=0;k<n-i;k++)
			cout<<"* ";
		cout<<endl;
	}
	return 0;
}
