#include "CharArrayHeader.h"
#include<iostream>
using namespace std;

void copyarr(char *&ptr, char *&copy, int count)
{

	for (int i = 0; i < count; i++)
	{
		copy[i] = ptr[i];
	
	}
	


}

void sort(char *&ptr, int count)
{

	for (int j = 1; j < count; j++)
	{
		for (int i = 0; i < count; i++)

			if (ptr[i] < ptr[j])
			{
				char temp = ptr[i];
				ptr[i] = ptr[j];
				ptr[j] = temp;
			}
	}
}

void input(char *&ptr, int count)

{
	cout << "Enter the element one by one" << endl;

	for (int i = 0; i < count; i++)
	{
		cin >> ptr[i];
	}
}

void output(char *&ptr, int count)

{

	for (int i = 0; i < count; i++)
	{
		cout << ptr[i] << "  ";
	}
	cout << endl;
}