#include "Employee.h"
#include <string>
#include <iostream>
using namespace std;

Employee::Employee()
{

	Salary = 0;
	name = "";
}

Employee::Employee(int sal, string nm)
{
	Salary = sal;
	name = nm;
}

int Employee::getsalary()
{
	return Salary;
}

void Employee::accept()
{
	cout << "\n Enter name:" << endl;
	cin.get();
	getline(cin, name);
	cout << "\n Enter Salary:" << endl;
	cin >> Salary;
}

void Employee::display()
{
	cout << "\n Salary:" << this->Salary << " Name:" << this->name << endl;
}
Employee::~Employee()
{
	cout << "Finish" << endl;
}
