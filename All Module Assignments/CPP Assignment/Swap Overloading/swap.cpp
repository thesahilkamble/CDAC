#include "swap.h"
#include <iostream>
using namespace std;

void swapping::swap(int &ra, int &rb)
{
    int temp = 0;
    temp = ra;
    ra = rb;
    rb = temp;
}

void swapping::swap(float &ra, float &rb) // Overladed by adding float data type
{
    float temp = 0;
    temp = ra;
    ra = rb;
    rb = temp;
}

void accept(int &a, int &b)
{
    cout << "Enter First Number" << endl;
    cin >> a;
    cout << "Enter Second Number" << endl;
    cin >> b;
}

void display(int &a, int &b)
{
    cout << "First Number: " << a << endl;
    cout << "Second Number: " << b << endl;
}

void accept(float &a, float &b)
{
    cout << "Enter First Number" << endl;
    cin >> a;
    cout << "Enter Second Number" << endl;
    cin >> b;
}

void display(float &a, float &b)
{
    cout << "First Number: " << a << endl;
    cout << "Second Number: " << b << endl;
}
