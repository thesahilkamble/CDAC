#include<iostream>
#include<iostream>
#include "Student.h"
#include "Student.h"
using namespace std;


		//CTOR
		Student::Student()
	       	{
		cout<<"\n CTOR called"<<endl;
		count++;

		rollNo =0;
		name = "";
		marks = 0;
		}
		
		Student::Student(int rno, string nm, int mk)
	       	{
		cout<<"\n PARAM CTOR called"<<endl;
		count++;
		rollNo = rno;
		name = nm;
		marks = mk;
		}

		int Student::getRollNo()
		{
			return rollNo;
		}

		void Student::accept()
		{
			cout<<"\n Enter rollNo:"<<endl;
			cin>>rollNo;
			cout<<"\n Enter name:"<<endl;
			cin.get();
			getline(cin, name);
			cout<<"\n Enter Marks:"<<endl;
			cin>>marks;

		}

		void Student::display() const
		{
cout<<"\nRollNo:"<<this->rollNo<<" Name:"<<this->name<<" Marks:"<<marks<<endl;

		}

		void Student::printCount()
		{
		cout<<"\n Count="<<count; 
		}

		Student::~Student()
	       	{
		cout<<"\n DTOR called"<<endl;
		}

//Static variable init
int Student::count =0;

