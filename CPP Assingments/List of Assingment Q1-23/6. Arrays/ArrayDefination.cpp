#include "ArrayHeader.h"
#include <iostream>
using namespace std;

void copyarr(int *&ptr, int *&copy, int count)
{

    for (int i = 0; i < count; i++)
    {
        copy[i] = ptr[i];
    }
}

void sort(int *&ptr, int count)
{

    for (int j = 1; j < count; j++)
    {
        for (int i = 0; i < count; i++)

            if (ptr[i] < ptr[j])
            {
                int temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
    }
}

void input(int *&ptr, int count)

{
    cout << "Enter the element one by one" << endl;

    for (int i = 0; i < count; i++)
    {
        cin >> ptr[i];
    }
}

void output(int *&ptr, int count)

{

    for (int i = 0; i < count; i++)
    {
        cout << ptr[i] << "  ";
    }
    cout << endl;
}

// ____________________________________________ Question 24 ____________________________________
int mini(int *&ptr, int count)

{
    int mini = ptr[0];

    for (int i = 1; i < count; i++)
    {

        if (ptr[i] < mini)
        {
            mini = ptr[i];
        }
    }
    return mini;
}

int maxi(int *&ptr, int count)

{
    int maxi = ptr[0];

    for (int i = 1; i < count; i++)
    {

        if (ptr[i] > maxi)
        {
            maxi = ptr[i];
        }
    }
    return maxi;
}

void copier(int *&ptr, int *&copy, int count)
{

    for (int i = 0; i < count; i++)
    {
        copy[i] = ptr[i];
        copy[i] = 5 * copy[i];
    }
}

// ____________________________________________ Question 25 ____________________________________

void del(int *&ptr, int count, int ind)
{
    if (ind == count - 1)
        return;
    for (; ind < count; ind++)
        ptr[ind] = ptr[ind + 1];
}
// ____________________________________________ Question 26 ____________________________________

void insert(int *&ptr, int count, int ind, int inval)
{
    if (ind == count)
   { ptr[ind-1]=inval;
        return;
    }

    for (int i = count - 1; i >= ind; i--)
        ptr[i] = ptr[i - 1];
        ptr[ind-1]=inval;
         
}
// ____________________________________________ Question 27 ____________________________________

