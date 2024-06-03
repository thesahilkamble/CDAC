#include "Certificate.h"
#include<string>
#include<iostream>
using namespace std;

Certificate::Certificate():certNo(""),Name(""),issueDate("")
{
}
Certificate::Certificate(string a,string b,string c):certNo(a),Name(b),issueDate(c)
{

}

void Certificate::accept()
{
	cout<< "\n Enter the Certificate Number:";
	cin>>certNo;
	cout<<"\n Enter the name:";
	cin.get();
	getline(cin,Name);
	cout<<"\n Enter Certificate Issue Date:";
	cin.get();
	getline(cin,issueDate);
}
void Certificate::display()
{
	cout<<certNo<<"\n"<<Name<<"\n"<<issueDate<<endl;
}
