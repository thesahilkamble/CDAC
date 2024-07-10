#include<iostream>
using namespace std;
namespace One
{
class Sample
	{
		public:
		void Who()
		{
		cout<<"\n One::Sample"<<endl;
		}
	};
};

namespace Two
{
 
	class Sample
	{
		public:
		void Who()
		{
		cout<<"\n Two::Sample"<<endl;
		}
	};
};



int main()
{
One::Sample s1;
s1.Who();

Two::Sample s2;
s2.Who();

return 0;
}