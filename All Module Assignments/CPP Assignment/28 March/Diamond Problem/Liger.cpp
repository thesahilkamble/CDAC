#include "Animal.h"
#include "lion.h"
#include "tiger.h"
#include <iostream>
using namespace std;

class liger: public tiger, public lion 
{
public:
liger()
{
    cout<<"Liger::Liger()"<<endl;
}

};