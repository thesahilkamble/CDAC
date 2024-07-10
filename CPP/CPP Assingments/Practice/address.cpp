#include <string>
#include <iostream>
using namespace std;

class address
{
private:
    int flatNo = 0;
    string area;
    int pinCode = 0;

public:
address()
{
    
}

    address(int f,string a, int p) : flatNo(f), area(a), pinCode(p)
    {
    }
    void accept()
    {
        cout << "Enter Flat Number: ";
        cin >> flatNo;
        cout << "Enter address: ";
        cin >> area;
        cout << "Enter Pincode: ";
        cin >> pinCode;
    }

    void display()
    {
        cout << flatNo << endl;
        cout << area << endl;
        cout << pinCode << endl;
    }
};

int main()
{
    address a1;
    a1.accept();
    a1.display();
    //address a2(3,"Aundh",411027);
   // a2.display();
}