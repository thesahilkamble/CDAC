#include "Shallow.h"
#include<iostream>
using namespace std;

Array::Array(int size)
{
this->size=size;
s=new int [size];
}
int Array::getindex(int i)
{
return s[i];
}
void Array::setindex(int index, int value)
{
s[index]=value;
}
Array::~Array()
{
delete []s;
}