#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Employee
{
protected:
    int employee_id;
    string name;
    string dob;

public:
    Employee() : employee_id(0), name(" "), dob(" ") {}

    Employee(int employee_id, string name, string dob) : employee_id(employee_id), name(name), dob(dob) {}

    virtual void Display() = 0;
    virtual int Salary() = 0;
};

class WageEmployee : public Employee
{

protected:
    int hours;
    int rate;

public:
    WageEmployee(int hours, int rate) : hours(hours), rate(rate) {}

    WageEmployee(int employee_id, string name, string dob, int hours, int rate) : Employee(employee_id, name, dob), hours(hours), rate(rate) {}

    //@Override

    void Display() override
    {
        cout << " Employee Id: " << employee_id << " Name: " << name << " DOB: " << dob << " Salary: " << hours * rate;
    }


  int Salary() override
    {
        return hours * rate;
    }
    // int Salary(int hours, int rate) override
    // {
    //     return hours * rate;
    // }
};

class Salesperson : public WageEmployee
{

protected:
    int items;
    int commision;

public:
    Salesperson(int hours, int rate, int items, int commision) : WageEmployee(hours, rate), items(items), commision(commision) {}

    //@override

    void Display()
    {
        cout << " Salary: " << hours * rate + items * commision;
    }
    
    
    int Salary()
    {

        return (hours * rate + items * commision);
    }
//     int Salary(int items, int comm)
//     {

//         return (hours * rate + items * commision);
//     }
};

class Manager : public Employee 
{
    private:
    int salary;
    int sub_ordinates;
    public:
    Manager(int salary, int sub_ordinates) : salary(salary), sub_ordinates(sub_ordinates) {}

};

class SalesManger : public Salesperson, public Manager
{
public:
SalesManger(int salary, int sub_ordinates) : Manager(salary,sub_ordinates) , Salesperson(hours, rate, items, commision) {}
};


int main()
{

    vector<Employee *> employees;
    employees.push_back(new WageEmployee(10, "Vaibhav", "2000-2-1", 10, 100));
    employees.push_back(new Salesperson(10, 100, 5, 200));

    for(Employee *emp : employees)
    {
        emp->Display();
        emp->Salary();
        delete emp;
    }
 

    //     Employee *ptr = new WageEmployee (10,"Vaibhav","2000-2-1" ,10, 100);
    //    *ptr.Display();

    //    WageEmployee w(10,"Vaibhav","2000-2-1" ,10, 100);
    //     w.Display();

    //     Salesperson s (10, 100, 5, 200);
    //     s.Display();

    return 0;
}
