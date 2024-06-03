#include"address.h"
#include<string>
#include<iostream>
using namespace std;

Address::Address():FlatNo(""),Area(""),Pincode("")
{

}
Address::Address(string fl,string ar,string pin):FlatNo(fl),Area(ar),Pincode(pin)
{

}
void Address::accept()
{
	cout<<"\n Enter the Flat no:";
	cin>>FlatNo;
	cout<<"\n Enter the Area:";
	cin.get();
	getline(cin,Area);
	cout<<"\n Enter the Pincode:";
	cin.get();
	getline(cin,Pincode);
}
void Address::display()
{
	cout<<FlatNo<<"\n"<<Area<<"\n"<<Pincode;
}


