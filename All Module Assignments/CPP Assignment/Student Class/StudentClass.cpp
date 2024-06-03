#include "ClassHeader.h"
#include <string>
#include <iostream>
using namespace std;

int main()
{
	student s;
	int size;
	int ch;

	cout << "1. Enter Data of Students" << endl;
	cout << "2. Display Data of Students" << endl;
	cout << "3. Sort by Roll Number & Display" << endl;
	cout << "4. Sort by Marks & Display" << endl;
	cout << "5. Sort by Name & Display" << endl;
	cout << "6. Exit" << endl;
	cout << "Enter you choice" << endl;
	cin >> ch;

	cout << "Enter the Number of Student: ";
	cin >> size;
	student sarr[size];

	do
	{

		switch (ch)
		{
		case 1:

			for (int i = 0; i < size; i++)
			{
				sarr[i].accept();
			}
			break;
		case 2:

			for (int i = 0; i < size; i++)
			{
				sarr[i].display();
			}
			break;
		case 3:
			sortbyrollno(sarr, size);
			for (int i = 0; i < size; i++)
			{
				sarr[i].display();
			}
			break;
		case 4:
			sortbymarks(sarr, size);
			for (int i = 0; i < size; i++)
			{
				sarr[i].display();
			}
			break;
		case 5:
			sortbyname(sarr, size);
			for (int i = 0; i < size; i++)
			{
				sarr[i].display();
			}
			break;
		case 6:
			exit(0);

		default:
			cout << "Invalid Choice" << endl;
		}

		cout << "Enter your choice" << endl;
		cin >> ch;
	} while (ch != 0);

	return 0;
}
