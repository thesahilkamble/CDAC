#include <iostream>
using namespace std;

int main()
{
    int n;
    int temp;

    cout << "Enter the number of Numbers to be stored " << endl;
    cin >> n;

    int *arr = new int(n);

    for (int i = 0; i < n; i++)

        cin >> arr[i];

    cout << "Before Sorting" << endl;
    for (int i = 0; i < n; i++)
        cout << " " << arr[i];


    for (int j = 1; j < n; j++)
    {
        for (int i = 0; i < n; i++)

            if (arr[i] > arr[i + 1])
            {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
    }
    cout <<endl<<"After Sorting" << endl;
    for (int i = 0; i <n; i++)
        cout <<" "<<arr[i];

    return 0;
}
