#include <iostream>
using namespace std;

void add(int num1, int num2, int num3, double num4)
{
    cout << "Additon =" << num1 + num2 + num3 + num4 << endl;
}

void add(int num1, int num2, float num3, double num4)
{
    cout << "Additon =" << num1 + num2 + num3 + num4 << endl;
}

void add(int num1, float num2, float num3, double num4)
{
    cout << "Additon =" << num1 + num2 + num3 + num4 << endl;
}

void add(int num1, int num2, int num3, int num4)
{
    cout << "Additon =" << num1 + num2 + num3 + num4 << endl;
}

void add(double num1, double num2, double num3, double num4)
{
    cout << "Additon =" << num1 + num2 + num3 + num4 << endl;
}

void add(char num1, double num2, double num3, double num4)
{
    cout << "Additon =" << num1 + num2 + num3 + num4 << endl;
}

int main()
{
    add(10, 20, 30, 40);
    add(10.34, 20.34, 30.3, 40.56);
    add('c', 20, 30, 40);
}