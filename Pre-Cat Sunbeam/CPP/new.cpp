#include <iostream>
using namespace std;

inline void Area(int b, int h)
{
    cout << "Area =" << 0.5 * b * h << endl;
}

int main()
{
    int b, h;
    cout << "Enter the Base lenth" << endl;
    cin >> b;
    cout << "Enter the Height" << endl;
    cin >> h;
    Area(b, h);
}