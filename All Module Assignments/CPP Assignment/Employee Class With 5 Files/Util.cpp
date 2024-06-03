#include "Util.h"
#include "Employee.h"

void sortbysalary(Employee a[], int size)
{
	for(int i=0 ; i < size; i++)
	{
		for(int j = i+1 ; j < size; j++)
		{
		if(a[i].getsalary() > a[j].getsalary()) {
		Employee temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		}
		}
	}
}
