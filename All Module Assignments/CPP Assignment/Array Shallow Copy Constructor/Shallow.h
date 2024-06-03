#ifndef SHALLOW_H
#define SHALLOW_H
class Array
{
private:
int *s;
int size;
public:
Array(int size);
int getindex(int i);
void setindex(int index, int value);
~Array();
};
#endif