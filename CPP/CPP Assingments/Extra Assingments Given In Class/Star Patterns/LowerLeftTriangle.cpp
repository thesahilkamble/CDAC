

#include <iostream>
using namespace std;

int main(){
	int n;
	int i;
	int j;
	cout<<"Enter no."<<endl;
	cin>>n;
	for(i=0;i<n;i++){
		for(j=0;j<=i;j++)
			cout<<"*";
		cout<<endl;
	}
	return 0;
}
