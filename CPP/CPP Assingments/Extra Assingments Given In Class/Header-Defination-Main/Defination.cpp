#include "HeaderFile.h"
#include<iostream>
using namespace std;

int add(int a,int b)
{
 cout << "\n Addition=" <<a+b<<endl;
 return 0;
}

int sub(int a,int b)
{
    if(a>b)
{cout << "\n Subtraction=" <<a-b<<endl;
return 0;
}
else
{cout << "\n Subtraction=" <<b-a<<endl;
return 0;
}
}


int multi(int a,int b)
{
cout << "\n Multiplication=" <<  a*b<<endl;
return 0;
}


float divi(float a,float b)
{
    if(b==0)
    {
 cout << "\n Divison by Zero not possible" << endl;
return 0;
    }
else
{ cout << "\n Divison=" <<  a/b<<endl;
return 0;
}
}
