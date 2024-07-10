#include<iostream>
using namespace std;

int main()
{
 int Num;
 int Sum=0;
 int Temp;
int i=1000;
 cout<<"Enter the four digit number"<<endl;
 cin>>Num;

 while(i!=1)
 {
	 Temp=Num/i;
	 Sum=Sum+Temp;
	 i=i/10;
 
 }

 cout<<"Addition of the digits is"<<Sum<<endl;

 return 0;

}
