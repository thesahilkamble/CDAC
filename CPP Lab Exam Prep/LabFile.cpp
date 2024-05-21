#include <iostream>
#include <fstream>
#include <string>
#include <vector>
using namespace std;

class Employee
{
private:
int ID;
string Name;
string DoJ;

public:
    Employee(int ID, string Name, string DoJ) :ID(ID),Name(Name),DoJ(DoJ) {}

const int getID() const {return ID; }
const string getName() const {return Name; }
const string getDoJ() const {return DoJ; }

};

int main ()
{
    // cout<<"Enter number of employee: ";
    // int EmployeeCount;

    // vector <Employee> employee(EmployeeCount);
    // for (int i = 0; i < EmployeeCount; i++)
    // {
    //     employee->getDetails();

    // }

    int ID;
    string Name;
    string DoJ;

    vector <Employee *> employee;
    
    bool exit = false;
    while(!exit)
    {
     cout<<"1. Enter employee details\n 2. Display all details"<<endl;
     int option;
     cout<<"Select option: ";
     cin>>option;

    switch (option){
    case 1:
    cout<<"Enter Employee details: ";
    cout<<"Employee ID: ";
    cin>>ID;
    cout<<"Employee Name: ";
    cin>>Name;
    cout<<"Employee Date of Joining: (dd-mm-yyyy) ";
    cin.get();
    getline(cin,DoJ);
    break;
    case 2:
    for (Employee *employee : employee)
    {
        cout<<employee->getID();
        cout<<employee->getDoJ();
        cout<<employee->getName();
    }
    break;
    }
    }
    employee.push_back(new Employee(ID,Name,DoJ));
    return 0;
}
