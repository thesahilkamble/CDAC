#include "Certificate.h"
#include "address.h"
#include<string>
using namespace std;

class student: public Certificate, public Address
{

private:
	int RollNo;
	int Marks;
	string Name;

public:
	student();
	student(int rn,int mk,string nm );
	void accept();
	void display();
          
	
};

