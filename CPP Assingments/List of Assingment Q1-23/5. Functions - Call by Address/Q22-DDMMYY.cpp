#include <iostream>
using namespace std;

void getDate(int *DD, int *MM, int *YY)
{
    cout << "Enter Date" << endl;
    cin >> *DD;
    cout << "Enter Month" << endl;
    cin >> *MM;
    cout << "Enter Year" << endl;
    cin >> *YY;
}

int main()
{
    int DD, MM, YY;

    getDate(&DD, &MM, &YY);
    cout << DD << "/" << MM << "/" << YY;

    return 0;
}