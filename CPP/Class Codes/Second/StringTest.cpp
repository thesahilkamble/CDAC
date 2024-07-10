#include<string>
#include<iostream>
using namespace std;
int main()
{
	string name;
	string fullName;
	cout<<"Enter name"<<endl;
	cin>>name;
	cout<<name<<endl;
	cin.get();//Eater
	cout<<"Enter full name"<<endl;
	getline(cin, fullName);
	cout<<fullName<<endl;
	return 0;
}
