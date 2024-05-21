#include <iostream>
using namespace std;

class dot
{
    int x, y;

public:
    dot()
    {
        x = 10;
        y = 20;
        cout << "Inside non para constructor of class" << endl;
    }
    dot(int a, int b)
    {
        x = a;
        y = b;
        cout << "Inside para constructor of class" << endl;
    }

    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    void setX(int a)
    {
        x = a;
    }
    void setY(int b)
    {
        y = b;
    }

    void display()
    {
        cout << "From Display Function" << endl;
        cout << "Dot X=" << x << endl;
        cout << "Dot Y=" << y << endl;
    }
    ~dot()
    {
        cout << "Destroyed" << endl;
    }
};

int main()
{
    dot d1(50, 60);
    d1.display();

    int x1 = d1.getX();
    int y1 = d1.getY();

    cout << "Getter Values" << endl;
    cout << "GetX=" << x1 << endl;
    cout << "GetY=" << y1 << endl;

    d1.setX(30);
    d1.setY(40);

    cout << "Setx=" << d1.getX() << endl;
    cout << "Sety=" << d1.getY() << endl;
    d1.display();
}