
#include "ArrayHeader.h"
#include <iostream>
using namespace std;

// void display(int arr[3][3])

// {

//     for (int i = 0; i < 3; i++)

//     {

//         for (int j = 0; j < 3; j++)

//         {

//             cin >> arr[i][j];
//         }
//         cout << endl;
//     }
// }

int main()

{
    int arr[3][3];

for (int i = 0; i < 3; i++)

    {

        for (int j = 0; j < 3; j++)

        {

            cin >> arr[i][j];
        }
        
    }

    for (int i = 0; i < 3; i++)

    {

        for (int j = 0; j < 3; j++)

        {

            cout << arr[i][j];
        }
        cout<<endl;
    }

    return 0;
}
