#ifndef ADDRESS_H
#define ADDRESS_H
#include <string>
using namespace std;
class Address
{
       	private:
		string FlatNo;
		string Area;
		string Pincode;
	public:
		Address();
		Address(string fl, string ar,string pin);
		void accept();
		void display();



};
#endif

