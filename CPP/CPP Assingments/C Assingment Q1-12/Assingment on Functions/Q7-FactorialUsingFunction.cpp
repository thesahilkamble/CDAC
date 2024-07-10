#include<iostream>
using namespace std;

int Fact(int F)
{
	if(F>1)
	return F*Fact(F-1);
 else
	 return 1;
}


int main()
{
int Num;
cout<<"Enter the Number"<<endl;
cin>>Num;
int res=Fact(Num);
cout<<"Factorial is "<<res<<endl;
cout<<"Factorial seq: ";
for(int i=1;i<=Num;i=i+1)
{
	cout<<Fact(i);
}

return 0;
}
