#include<iostream>
using namespace std;

class Sample
{

mutable	int i;
 public:
explicit Sample(int k):i(k)
{
}
void fun()const
{
 i= i+1;
}
void Display()
{
cout<<"\n Value of int:"<<i;
}

};
int main()
{
 Sample s=Sample(10);
 s.Display();
 int * p =(int*)&s;
 *p =100;
 s.Display();
s.fun();
s.Display();
cin.get();
return  0;
}
