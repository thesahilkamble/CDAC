#include<iostream>
using namespace std;

class MyArray
{
	private:
		int *p;
		int size;
	public:
		MyArray(int s)
		{
			size = s;
			p = new int[size];
		}

		int getAtIndex(int index)
		{
			return p[index];
		}

		void setAtIndex(int index, int value)
		{
			p[index] = value;
		}
		
		~MyArray()
		{
			cout<<"\n DTOR called";
			delete [] p;
		}
};


int main()
{

	MyArray a(2);
	a.setAtIndex(0, 100);
	a.setAtIndex(1, 200);
	cout<<"\n Value="<<a.getAtIndex(0);

	{
	MyArray b =a;
	cout<<"\n Value="<<b.getAtIndex(0);
	}

	cout<<"\n Value="<<a.getAtIndex(0);
	cout<<"\n Program is going to exit"<<endl;
	return 0;
}
