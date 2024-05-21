#include<iostream>
using namespace std;

int main()

{
int year;
cout<<"Enter the year"<<endl;
cin>>year;

if (year%400==0 || year%100!=0 && year%4==0)

	cout<<"Givrn year is a leap year"<<endl;

else 
	cout<<"Given year is not a leap year"<<endl;
return 0;

}
