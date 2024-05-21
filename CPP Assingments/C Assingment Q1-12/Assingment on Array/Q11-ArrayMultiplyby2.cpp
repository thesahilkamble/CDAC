#include <iostream>
using namespace std;

// int display(int *ptr,int num)
// {
// for (int  i = 0; i < num; i++)
// {
//     cout<<arr[]<<
// }

int main()
{
    int n;
    cout << "Enter the number of Numbers to be stored " << endl;
    cin >> n;
    int arr[n];

    for (int i = 0; i < n; i++)
        cin >> arr[i];

    for (int i = 0; i < n; i++)

        cout <<" " <<arr[i] * 2;

    // int *p=arr;

    // display(p,n);

    return 0;
}