#include"studhead.h"
#include <string>
#include <iostream>
using namespace std;

  student::student():RollNo(""),Marks(""), Name("")
{

}
student::student(int rn,int mk,string nm):RollNo(rn),Marks(mk),Name(nm)
{

}
void student::accept()
{
    cout << "Enter the Roll Number: " << endl;
    cin >> RollNo;
    cout << "Enter the Marks: " << endl;
    cin >> Marks;
    cout<<"\n Enter the Name: ";
    get.ch();
    getline(cin,Name);
}

void student::display()
{
    cout << RollNo << "\n " << Marks << " \n" << Name << endl;
}



