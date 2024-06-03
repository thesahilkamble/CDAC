#include <iostream>
using namespace std;

class animal
{
public:
animal()
{
    cout << "animal::animal()" << endl;
}
void walk()
{
    cout << "animal walks" << endl;
}
};

class tiger : virtual public animal
{
public:
tiger()
{
    cout<<"Tiger::tiger()"<<endl;
}

};

class lion : virtual public animal
{
public:
lion()
{
    cout<<"lion::lion()"<<endl;
}

};

using namespace std;

class liger: public tiger, public lion 
{
public:
liger()
{
    cout<<"Liger::Liger()"<<endl;
}

};


int main()
{
    liger L;
    L.walk();
    return 0;
}

