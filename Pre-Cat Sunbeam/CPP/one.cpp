#include <iostream>
using namespace std;

namespace ns
{
    struct employe
    {
        // empID,empName,empSalary,and two function AcceptData and printEmpData
    private:
        int Id;
        char Arr[10];
        int Salary;

    public:
        void acceptdata()
        {
            cout << "Enter Employee ID" << endl;
            cin >> Id;
            cout << "Enter Employee Name" << endl;
            cin >> Arr;
            cout << "Enter Employee Salary" << endl;
            cin >> Salary;
        }
        void display()
        {
            cout << "Employe Details: " << Id << endl;
            cout << "Employe Details: " << Arr << endl;
            cout << "Employe Details: " << Salary << endl;
        }
    };
}

int main()
{
    ns::employe e1;
    e1.acceptdata();
    e1.display();
}