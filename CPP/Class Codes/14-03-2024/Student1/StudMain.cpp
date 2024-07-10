#include "Util.h"
#include "Student.h"

int main()
{

	Student sarr[2];
	sarr[0].accept();
	sarr[1].accept();
	sortStudents(sarr,2);
	sarr[0].display();
	sarr[1].display();
	return 0;
}
