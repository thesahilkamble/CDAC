#include "Employee.h"
#include <string>
#include <iostream>
using namespace std;

Employee::Employee(int x)
{
	size = x;
	ptr = new int[size];
	Salary = 0;
	name = " ";
}

Employee::Employee(const Employee &that)
{
	this->size = that.size;
	this->ptr = new int[this->size];
	for (int i = 0; i < that.size; i++)
	{ 
		this->ptr[i] = that.ptr[i];
	}
}
int Employee::getsalary()
{
	return Salary;
}

void Employee::accept()
{
	cout << "\n Enter name:" << endl;
	getline(cin, name);

	cout << "\n Enter Salary:" << endl;
	cin >> Salary;
	cin.get();
}

void Employee::display()
{
	cout << "\n Salary:" << this->Salary << " Name:" << this->name << endl;
}
Employee::~Employee()
{
	cout << "Finish" << endl;
}
