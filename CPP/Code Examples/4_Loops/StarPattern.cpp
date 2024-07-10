#include<isostream>
using namespace std;

int main()
{
	 int n=0;
	 cout<<"Enter any number:";
	 scanf("%d",&n);
	 int i,j;
	 for(i=1;i<=n;i++)
	 {
		cout<<"\n";
	 	for(j=1;j<=i;j++)
	 	{	
	 	cout<<"*";
		}
	 }
	 cout<<"\n";
	return 0;
}
