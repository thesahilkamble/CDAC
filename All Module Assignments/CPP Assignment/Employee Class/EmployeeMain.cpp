#include <string>
#include <iostream>
using namespace std;

class Employee
{
private:
    string name;
    int Eid;
    int Sal;
    static int count;

public:
    Employee()
    {
        name = " ";
        Eid = 0;
        Sal = 0;
        count++;
    }

    Employee(string nm, int Id, int Salary)
    {
        name = name;
        Eid = Id;
        Sal = Salary;
        count++;
    }

    void display() const // Observation: Works with using this pointer when obj and mf is const
    {
        cout << "\n name" << this->name<< "\n Eid" << this->Eid << "\n Sal" << Sal << endl;
    }

    static void show()
    {
        cout << " \n Count is " << count << endl;
    }

    void accept()
    {

        cout << "\n Enter name " << endl;
        getline(cin, name);
        cout << "\n Enter Eid " << endl;
        cin >>Eid;
        cout << "\n Enter Salary " << endl;
        cin >> Sal;
        cin.get();
    }

    void printout() // Observation 1: Mf non const, obj const Illegal.
                  // Observation 2: Mf non const, obj non const works.
    {
        cout << "\n name" << this->name<< "\n Eid" << this->Eid << "\n Sal" << Sal << endl;
    }
};

int Employee::count = 0;

int main()
{
    Employee const s1;                  // const obj
    Employee s2("Jaya", 52896, 450000); // non const para ctor
    Employee s3;                        // non const obj

    Employee *employee = new Employee[3];

    for (int i = 0; i < 3; i++)
    {
        employee[i].accept();
    }

    Employee::show();

    delete[] employee;

    return 0;
}
