
#include "address.cpp"

class student: public address
{
private:
    int rollNo;
    char name[30];

public:
    student()
    {
        rollNo = 0;
    }
    // student(int roll, char name[] = "")
    // {
    // }

    void accept(int *size)
    {
        for (int i = 0; i < *size; i++)
        {
            cout << "Enter Roll Number: ";
            cin >> rollNo;
            cout << "Enter Name: ";
            cin.get(name[i]);
        }
    }
    void display(int *size)
    {
        for (int i = 0; i < *size; i++)
        {
            cout << name[i];
        }
    }
};

int main()
{
    int n = 0;
    cout << "Enter Number of students: ";
    cin >> n;

    student s1;
    s1.accept(&n);
    s1.display(&n);
    return 0;
}