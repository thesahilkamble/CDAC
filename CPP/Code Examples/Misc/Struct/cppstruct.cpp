#include<iostream>
#include<string>
using namespace std;

typedef struct Student
{
	int rno;
	string name;
	
	private:
	int age;
	
	public:
	void Accept()
	{
		cout<<"\n Enter roll no"<<endl;
		cin>>rno;
		cin.get();
		cout<<"\n Enter Name"<<endl;
		getline(cin,name);
		cout<<"\n Enter age "<<endl;
		cin>>age;
	}
	
	void Display()
	{
		cout<<"\n Roll no="<<rno<<"\t Name="<<name<<"\t Age="<<age<<endl;
		
	}
} STUDENT;


int main(){
	STUDENT s;
	//Accessing pvt dat members outside class
	s.rno = 10;
	s.name = "Alia";
	s.Display();
	s.Accept();
	s.Display();
	return 0;
}