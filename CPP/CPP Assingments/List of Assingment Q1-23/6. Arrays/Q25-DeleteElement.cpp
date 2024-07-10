#include "ArrayHeader.h"
#include <iostream>
using namespace std;

int main()
{
    int n;
    int index;
    cout << "Enter the size of array" << endl;
    cin >> n;
    int *ptr = new int[n];

    input(ptr, n);
    cout << "The array you entred is" << endl;
    output(ptr, n);
    cout<<"Enter the index number to delete element "<<endl;
    cin>>index;
    del(ptr,n,index);
    n=n-1;
    output(ptr,n);
    delete []ptr;
}