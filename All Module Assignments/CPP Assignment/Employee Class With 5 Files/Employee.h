#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#include<string>
class Employee
{
	private:

		std::string name;
		int Salary;
	public:
		Employee();
		Employee(int sal, std::string nm);
		int getsalary();
		void accept();
		void display();
        ~Employee();
};
#endif

