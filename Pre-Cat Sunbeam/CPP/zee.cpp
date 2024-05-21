#include <iostream>
using namespace std;

class point
{
protected:
    int a;
    int b;

public:
    point() : a(10), b(20)
    { 
        cout << "Parent Concs" << endl;
    }
    ~point()
    {
        cout << "Parent Destro" << endl;
    }
    friend void display(point &p1);
};

class dot : public point
{
private:
    string name;
    int size;

public:
    dot() : name("Dog"), size(5)
    {
        cout << "Child Cons" << endl;
    }
    ~dot()
    {
        cout << "child destro" << endl;
    }
};

void display(point &p1)
{
    cout << "A = " << p1.a << endl;
    cout << "B = " << p1.b << endl;
}
int main()
{
    point p1;
    display(p1);
    dot d1;
    display(d1);
}