#include<iostream>
#include<iomanip>
#include<string>
#include<cmath>
using namespace std;
int main()
{
 int k=20;
string str="praphul";
cout<<"\n"<<setw(5)<<k;
cout<<"\n"<<setfill('*')<<setw(20)<<k;
cout<<"\n"<<left<<setfill('*')<<setw(20)<<k;
cout<<"\n"<<setbase(8)<<k;

cout<<flush;
cout<<"\n"<<hex<<k;
cout<<"\n precision="<<cout.precision()<<"\t Value="<<sqrt(2.0);
cout<<setprecision(2);
cout<<"\n precision="<<cout.precision()<<"\t Value="<<sqrt(2.0);
return 0;
}
