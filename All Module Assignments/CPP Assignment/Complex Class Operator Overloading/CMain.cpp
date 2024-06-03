#include "header.h"
#include <iostream>
using namespace std;
int main()
{
    Complex obj1(2, -500);
    Complex obj2(5, -100);
    Complex obj3(10, 50);
    Complex obj4(5, -100);

    Complex c3;
    c3 = c3.operator+(obj1).operator+(obj2); // c3 = obj1 + obj2
    c3.display();

    Complex c4;

    c4 = c4.operator+(obj3).operator-(obj4); // c4 = obj1 - obj2
    c4.display();
    return 0;
}