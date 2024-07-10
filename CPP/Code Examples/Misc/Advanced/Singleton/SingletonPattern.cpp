#include<iostream>
using namespace std;

class Sigleton
{
private:
static Sigleton* sp;
Sigleton()
{
}

public:

static Sigleton GetInstance()
{
	if(NULL == sp)
	{
	sp = new Sigleton();
	}
   return *sp;
}

};
Sigleton* Sigleton::sp = NULL;

int main()
{
Singleton single = Singleton.GetInstance();
Singleton  second = Singleton.GetInstance();

return 0;
}