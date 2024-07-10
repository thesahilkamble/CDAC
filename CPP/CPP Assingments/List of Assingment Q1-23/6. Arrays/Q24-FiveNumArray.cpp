#include "ArrayHeader.h"
#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter the size of array" << endl;
    cin >> n;
    int *ptr = new int[n];
    int *copy = new int[n];

    input(ptr, n);
    cout << "The array you entred is" << endl;
    output(ptr, n);
  
   int min= mini(ptr,n);
     cout<<"The minimum number is "<<min<<endl;
    int max=maxi(ptr,n);
      cout<<"The maxmimum number is "<<max<<endl;
      copier(ptr,copy,n);
      cout<<"The copied and updated array is  "<<endl;
      output(copy,n);

    delete[] ptr;
    delete[] copy;

    return 0;
}