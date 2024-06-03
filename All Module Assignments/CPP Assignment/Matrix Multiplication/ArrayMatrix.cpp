#include "ArrayHeader.h"
#include <iostream>
using namespace std;

int main()

{
    int arr1[3][3];
    int arr2[3][3];
    int res[3][3];

    int i;
    do
    {
        cout << "Select the option from below" << endl;
        cout << "1. Input Matrix 1" << endl;
        cout << "2. Input Matrix 2" << endl;
        cout << "3. Print Matrix 1" << endl;
        cout << "4. Print Matrix 2" << endl;
        cout << "5. Multiply the two matrix" << endl;
        cout << "6. Print the resultant matrix" << endl;
        cout << "7. Exit" << endl;
        cin >> i;

        switch (i)
        {
        case 1:
            MatIn(arr1);
            break;
        case 2:
            MatIn(arr2);
            break;
        case 3:
            MatOut(arr1);
            break;
        case 4:
            MatOut(arr2);
            break;
        case 5:
            MultiplyMat(arr1, arr2, res);
            break;
        case 6:
            MatOut(res);
            break;
        case 7:
            exit(0);
            return 0;
        }
    } while (i != 0);

    return 0;
}
