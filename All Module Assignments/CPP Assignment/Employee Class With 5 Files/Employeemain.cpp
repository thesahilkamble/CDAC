#include "Util.h"
#include "Employee.h"

int main()
{

	Employee empl[2];
	empl[0].accept();
	empl[1].accept();
	//empl[2].accept();
	//empl[3].accept();
	//empl[4].accept();
	sortbysalary(empl,2);
	empl[0].display();
	empl[1].display();
	//empl[2].display();
	//empl[3].display();
	//empl[4].display();
	return 0;
}

