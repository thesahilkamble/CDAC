#include <iostream>
using namespace std;
int main()
{
    int s = 21;
    int m;
    int c;

    do
    {
        cout << "Sticks = " << s << endl;
        cout << "Pick 1-4 sticks ";
        cin >> m;

        s = s - m;
        if (s == 0)
        {
            cout << "Computer is winner";
            break;
        }

        c = 5 - m;
        cout << "Computer choose = " << c << endl;
        s = s - c;
    } while (s != 0);

    return 0;
}