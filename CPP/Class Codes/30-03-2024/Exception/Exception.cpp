#include<iostream>
#include<stdexcept>
using namespace std;

void divide(int a, int b)
{
if(0==b)
{

throw runtime_error("Divide by 0 error") ;
}

}

int main()
{

try
{

divide(5,10);
cout<<"\n after divide"<<endl;
}
catch(runtime_error err)
{

cout<<err.what();
}

return 0;
}
