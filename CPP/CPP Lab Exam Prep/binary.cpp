#include <iostream>
#include<fstream>
using namespace std;

int main()
{
    fstream file("binary.bin",ios::binary | ios::in | ios::out | ios::app);
    if(!file.is_open())
    {
        cout<<"File not opened"<<endl;
    }
    else
    {
        
        file<< "Hell0 stream fileios::binary | ios::in | ios::out | ios::ap :iffile.is_opencoutFile not" <<endl;

    }

    return 0;
}
