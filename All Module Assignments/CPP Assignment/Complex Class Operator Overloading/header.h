#ifndef VAIBHAVI_H
#define VAIBHAVI_H

#include <iostream>
using namespace std;

class Complex
{
private:
    int real, imag;

public:
    Complex();
    Complex(int real, int imag);
    void display();
    Complex operator+(const Complex &obj) const;
    Complex operator-(const Complex &obj) const;
};
#endif