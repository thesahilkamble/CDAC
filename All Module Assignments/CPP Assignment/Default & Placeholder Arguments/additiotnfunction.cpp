#include <iostream>
using namespace std;

int sum(int num1, int num2 = 0, int num3 = 0)
{
    return num1 + num2 + num3;
}
int Sub(int num1, int num2, int)
{
    return num1 - num2;
}
int main()
{
    cout << sum(20,50) << endl;
    cout << Sub(725, 100, 40) << endl;
    cout << sum(86, 43);
    cout << Sub(9999, 1224,540);
    return 0;
}