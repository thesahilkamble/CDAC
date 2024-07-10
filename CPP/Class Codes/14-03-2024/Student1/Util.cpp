#include "Util.h"
void sortStudents(Student arr[], int length)
{
	for(int i=0 ; i < length; i++)
	{
		for(int j = i+1 ; j < length; j++)
		{
		if(arr[i].getRollNo() > arr[j].getRollNo()) {
		Student temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
	}
}
