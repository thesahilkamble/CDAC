#include<iostream>
using namespace std;
int factorial (int fact)
{
    if (fact>1)
    return fact*factorial(fact-1);
    else
    return 0;
}
double power(double rad,double *res)
{
    int sign=1;
    int power=1;

    for (int i=1; i<=5; i++)
    {
        *res=*res+sign*((rad^power)/factorial(power));

        sign=sign*-1;
        power=power+2;


    }
    return *res;
}

int main()
{


int degree;
double radian;
double result;

cout<<"Enter the Sine Angle in Degrees"<<endl;
cin>>degree;
radian=degree*(3.14/180);
cout<<radian;
power(radian,&result);

cout<<"The Sine value is = "<<result<<endl;

    return 0;
}
