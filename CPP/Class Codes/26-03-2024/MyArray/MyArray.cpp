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

		//MyArray b(a);
	 MyArray(const MyArray& that)
		{
			//Copy size

			this->size = that.size;
			//Create separate memory
			this->p = new int[this->size];
			//Copy contents of memory
			for( int i =0; i < that.size; i++)
			{
				this->p[i] = that.p[i];
			}

		}

		int& operator[](int index)
		{
			return p[index];
		}

		
		~MyArray()
		{
			cout<<"\n DTOR called";
			cout<<"\n Free up memory at "<<p;
			delete [] p;
		}
};


int main()
{

	MyArray a(2);
	a[0] = 100;
	a[1] = 200;
	cout<<"\n Value="<<a[0];

/*	{
	MyArray b =a;
	cout<<"\n Value="<<b.getAtIndex(0);
	}

	MyArray c(a);
	cout<<"\n Value="<<a.getAtIndex(0);
	cout<<"\n Program is going to exit"<<endl;
*/	return 0;
}
