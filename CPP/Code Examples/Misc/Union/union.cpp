#include<iostream>
#include<iomanip>
using namespace std;
union Number
{
	int i;
	long l;
	double d;
	
	int getSize()
	{
		return sizeof(union Number);
	}
};


int main()
{
	union Number n;
	cout<<"\n Int size="<<sizeof(int);
	cout<<"\n Long size="<<sizeof(long);
	cout<<"\n Double size="<<sizeof(double);
	cout<<"\n size="<<sizeof(n);
	
	n.d= 10.10;
	cout<<"\n Int="<<n.i;
	cout<<"\n Double="<<n.d;
	
	cout<<"\n Size="<<n.getSize();
	
	//cout << setw(21) << left << "Test"    << n.d << endl;
	
	return 0;
}