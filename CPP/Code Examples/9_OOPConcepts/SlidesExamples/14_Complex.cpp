#include<iostream>
using namespace std;
class Complex{
 private: 
 int i;
 int j;
 public:
 Complex() // Default ctor
	{ i=0;
	 j=0;	}
//Parameterized ctor
	Complex(int p, int k)
	{ i=p;
	 j=k;	}
 
void Accept(){	
cin>>i>>j;	} 

void Display(){
	cout<<"\n"<<i<<" "<<j; } 
};
	
int main(){
	Complex c1; // Default constructor call
	Complex c2(10,10); // Parameterized ctor
	c1.Display();
	c2.Display();
	return 0; }
 // If programmer implements any constructor compiler will not provide default constructor
