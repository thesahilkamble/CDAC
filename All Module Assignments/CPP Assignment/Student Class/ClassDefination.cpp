
#include <string>
#include <iostream>
#include "ClassHeader.h"
using namespace std;


int student::getRollNo()
	{
		return RollNo;
	}
	int student::getMarks()
	{
		return Marks;
	}
	string student::getname()
	{
		return name;
	}

void student::accept()
{
    cout << "Enter the Roll Number: " << endl;
    cin >> RollNo;
    cout << "Enter the Name: " << endl;
    cin.get();
    getline(cin, name);
    cout << "Enter the Marks: " << endl;
    cin >> Marks;
}

void student::display()
{
    cout << RollNo << " " << name << " " << Marks << endl;
}

void sortbyrollno(student arr[], int length)
{
    student temp;
    for (int i = 0; i < length; i++)
    {
        for (int j = i + 1; j < length; j++)
        {
            if (arr[i].getRollNo() > arr[j].getRollNo())
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

void sortbymarks(student arr[], int length)
{
    student temp;
    for (int i = 0; i < length; i++)
    {
        for (int j = i + 1; j < length; j++)
        {
            if (arr[i].getMarks() > arr[j].getMarks())
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

void sortbyname(student arr[], int length)
{
    student temp;
    for (int i = 0; i < length; i++)
    {
        for (int j = i + 1; j < length; j++)
        {
            if (arr[i].getname() > arr[j].getname())
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}