#include "header.h"
#include<iostream>
using namespace std;

		Complex::Complex()
		{
			real = 0;
			imag = 0;
		}

		Complex::Complex(int real, int imag)
		{
			this->real = real;
			this->imag = imag;
		}

		void Complex::display()
		{
            char ch;
            ch=(imag>=0)?'+':'-';
			cout << "Complex Number is: " << real << ch << abs(imag)<<"i"<<endl; //abs to remove minus from imag.
		}

		Complex Complex::operator+(const Complex &obj) const
		{
			Complex c4;
			c4.real = this->real + obj.real;
			c4.imag = this->imag + obj.imag;

			return c4;
		}

		Complex Complex::operator-(const Complex &obj) const
		{
			Complex c5;
			c5.real = this->real - obj.real;
			c5.imag = this->imag - obj.imag;

			return c5;
		}
