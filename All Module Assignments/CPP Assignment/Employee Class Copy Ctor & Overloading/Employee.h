#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#include<string>
class Employee
{
	private:

		std::string name;
		int Salary;
		int *ptr;
		int size;
	public:
		Employee(int x);
		Employee(const Employee &that);
		// Employee(int sal, std::string nm);
		int getsalary();
		void accept();
		void display();
        ~Employee();
};
#endif

