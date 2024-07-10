#include<iostream>
#include<string>
using namespace std;
enum Gender
{
	MALE,
	FEMALE,
	OTHER
};

class Student
{
	private:
	int rno;
	string name;
	Gender gen;
	
	public:
	Student(int r, string n, Gender g):rno(r),name(n),gen(g){
	}
	
	void Display(){
		cout<<"\n Roll no="<<rno<<"\t Name="<<name<<"\t Gender="<<gen<<endl;
	}
	
};

int main(){
	Student s(11,"Alia",FEMALE);
	s.Display();
	return 0;
}
	

