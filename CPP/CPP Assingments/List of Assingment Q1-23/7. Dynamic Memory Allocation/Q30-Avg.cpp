#include "Header.h"
#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter the number of subjects" << endl;
    cin >> n;
    int *ptr = new int[n];
    cout << "Enter the marks for each subject" << endl;
    input(ptr, n);
    cout << "Average marks are " << endl;

    int temp = 0;
    for (int i = 0; i <= n; i++)
        temp = temp + ptr[i];
    temp = temp / n;
cout<<temp;
    delete[] ptr;

    return 0;
}