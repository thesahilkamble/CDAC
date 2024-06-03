#include "CharArrayHeader.h"
#include <iostream>
using namespace std;

int main()
{
	int n;
	cout << "Enter the size of array" << endl;
	cin >> n;
	char *ptr = new char[n];
	char *copy= new char[n];

	input(ptr, n);
cout << "The array you entred is" << endl;
	output(ptr, n);
cout << "Before Sorting" << endl;
output(ptr, n);
	sort(ptr, n);
	cout << "After Sorting in Decending Order" << endl;

	output(ptr, n);
cout << "Copying your Array to New Array" << endl;
	copyarr(ptr,copy,n);

	output(copy,n);

	delete []ptr;
	delete []copy;

	return 0;
}
