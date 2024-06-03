// #include"swap.h"
// #include<iostream>
// using namespace std;
//  int main()
// {
// swapping obj;
// obj.accept();
// obj.display();
// // obj.swap();
// obj.display();
// }

#include "swap.h"
#include <iostream>
using namespace std;

class swapping
{
private:
    int x, y;
public:
    swapping()
    {
        x = 0;
        y = 0;
    }

    void accept()
    {
        cout << "Enter First Number" << endl;
        cin >> x;
        cout << "Enter Second Number" << endl;
        cin >> y;
    }

    void display()
    {
        cout << "First Number: " << x << endl;
        cout << "Second Number: " << y << endl;
    }

    void swap(int &ra, int &rb)
    {
        int temp = 0;
        temp = ra;
        ra = rb;
        rb = temp;
    }
};

 int main()
{
swapping obj;
obj.accept();
obj.display();
//obj.swap();
obj.display();
}