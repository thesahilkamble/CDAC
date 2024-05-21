#include "ArrayHeader.h"
#include <iostream>
using namespace std;

int main()
{
    int n;
    int index;
    int insertvalue;
    cout << "Enter the size of array" << endl;
    cin >> n;
    int *ptr = new int[n];

    input(ptr, n);
    cout << "The array you entred is" << endl;
    output(ptr, n);
    cout << "Enter the number to be inserted" << endl;
    cin >> insertvalue;
    cout << "Enter the index number to insert element " << endl;
    cin >> index;
    insert(ptr, n, index, insertvalue);
    n=n+1;
    output(ptr, n);

    delete[] ptr;
}