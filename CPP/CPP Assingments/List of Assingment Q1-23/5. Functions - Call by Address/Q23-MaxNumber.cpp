#include <iostream>
using namespace std;

int Max(int *num1, int *num2)
{
    if(*num1==*num2)
    return 0;
    if(*num1>*num2)
    return *num1;
    else
    return *num2;
}

int main()
{
    int num1, num2;

    cout << "Enter the first number " << endl;
    cin >> num1;
    cout << "Enter second number " << endl;
    cin >> num2;

    int res = Max(&num1, &num2);
    if(res==0)
    cout<<"Numbers are same"<<endl;
    else
    cout << "Max number is = " << res;

    return 0;
}