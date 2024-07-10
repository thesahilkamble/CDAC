#include<iostream>
using namespace std;

int main()
{
int num1,num2,num3,res;
cout<<"Enter the three numbers"<<endl;
cin>>num1;
cin>>num2;
cin>>num3;

res=(num1>num2&&num1>num3?num1:num2>num3?num2:num3);
cout<<"Maximum number out of the three is "<<res<<endl;

    return 0;
}
