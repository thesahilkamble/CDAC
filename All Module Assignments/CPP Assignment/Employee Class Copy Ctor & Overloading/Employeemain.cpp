#include "Employee.h"

int main()
{

	Employee e(2);
	e.accept();
	// sortbysalary(e,2);
	e.display();
	Employee e1(e);
	e1.display();
	return 0;
}
