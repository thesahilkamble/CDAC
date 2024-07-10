#include<iostream>
using namespace std;

class Singleton
{
  private:
	int i;
	int j;
	static Singleton obj;

	Singleton():i(0),j(0)
	{
	}
public:
static Singleton* CreateInstance()
{

return &Singleton::obj;
}
void Accept()
{
cout<<"\n Enter value of I:";
cin>>i;
cout<<"\n Enter value of J:";
cin>>j;
}
void Display()
{
cout<<"\n Value of I:"<<i;
cout<<"\n Value of J:"<<j<<endl;

}
};

Singleton  Singleton::obj;


int main()
{

Singleton *p =NULL;

p= Singleton::CreateInstance();
p->Accept();
p->Display();
cout<<"\n second time contents are";
Singleton *p1 = Singleton::CreateInstance();
p1->Display();
return 0;
}
