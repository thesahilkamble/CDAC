#include<iostream>
using namespace std;

int RunningSumofNnumbers(int x)
{
	if(x==0)
		return 0;
	
	return(x+RunningSumofNnumbers(x-1));

}

int main()
{
int n;

cout<<"Enter the Nth term"<<endl;
cin>>n;

int res=RunningSumofNnumbers(n);
cout<<res<<endl;

return 0;

}
