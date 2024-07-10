#include<set>
#include<string>
#include<iostream>
using namespace std;

int main()
{
	set<string> st;
	char ch;
	
	do
	{
	string name;
	cout<<"\n Enter Name:";
	getline(cin,name);
	st.insert(name);
	cout<<"\n Do u want to continue(y or n):";
	cin>>ch;
	cin.get();
	}while(ch !='n');

//	set<string> st1(st.begin(),st.end());
//	st1.insert(st.begin(),st.end());

//Traversing
	cout<<"\n Listing set";
	set<string>::iterator it =st.begin();
	while(it !=st.end())
	{
	cout<<"\n"<<*it;
	it++;
	}
//find
//
string str;
cout<<"\n Value to be changed:";
getline(cin,str);
it =st.find(str);
cout<<"\n Value found:"<<*it;

//find
//st.count(name);

return 0;

}
