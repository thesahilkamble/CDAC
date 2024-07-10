#include<typeinfo>
#include<iostream>
#include<string>
using namespace std;


int main()
{

string s;
if(typeid(s) == typeid(string))
{
	cout<<"\n S is string"<<endl;
}
cout<<typeid(s).name()<<endl;
cout<<typeid(string).name()<<endl;
cout<<typeid(int).name()<<endl;
return 0;
}
