#include "Shallow.h"
#include<iostream>
using namespace std;

int main()
{
int n;
cout << "Enter number of elements in array : " << endl;
cin >> n;

Array obj(n);

int ele;
for(int i = 0 ; i < n ; i++)
{
	cout << "Enter " << i <<"th element: " << endl;
	cin >> ele;
	obj.setindex(i, ele);
}
for(int i = 0 ; i < n ; i++)
{
	cout << obj.getindex(i);
}

// Shallow copy will be created of Obj into cop.
// Destructor gets called for obj, deallocating the common memory for both objects.

Array cop=obj;
cout<<"\n Value at="<<cop.getindex(0);
return 0;
}