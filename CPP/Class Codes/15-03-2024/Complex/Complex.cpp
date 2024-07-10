#include"Complex.h"

Complex::Complex(int i,int j)
{
	this->i = i;
	this->j = j;
}

void Complex::Accept()
{
	cout<<"\n Enter I:"<<endl;
	cin>>i;

	cout<<"\n Enter J:"<<endl;
	cin>>j;
}
void Complex::Display()const
{

	cout<<"\n"<< i<<"+"<< "j"<<j<<endl; 
	
}

int Complex:: GetValueI()const
{
 return i;
}

void Complex::SetValueI(int k)
{
	i=k;
}



Complex Complex::operator+(const Complex& c2) const
{
Complex c3;
c3.i = this->i + c2.i;
c3.j = this->j + c2.j;
return c3;
}
