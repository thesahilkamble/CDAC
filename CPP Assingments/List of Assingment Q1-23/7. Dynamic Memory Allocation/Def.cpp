#include "Header.h"
#include <iostream>
using namespace std;

void input(int *&ptr, int count)

{
    for (int i = 0; i < count; i++)
    {
        cin >> ptr[i];
    }
}
int average(int *&ptr, int count)
{
    int temp = 0;
    for (int i = 0; i <= count; i++)
        temp = temp + ptr[i];
        temp=temp/count;
        return temp;
}