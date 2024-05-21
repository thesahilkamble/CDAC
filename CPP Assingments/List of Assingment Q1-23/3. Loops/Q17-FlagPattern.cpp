#include <iostream>
using namespace std;

int main()

{

    for (int i = 0; i <= 6; i++)

    {

        for (int j = 1; j <= 5 - 1; j++)

        {

            cout << j;
        }

        for (int k = 0; k < i * 2 - 1; k++)

        {

            cout << " ";
        }

        for (int k = 5 - i; k >= 1; k--) 

        {

            if (k!= 71)
                cout << k;
        }

        cout << endl;
    }
}