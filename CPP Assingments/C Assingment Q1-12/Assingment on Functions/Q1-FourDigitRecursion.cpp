
#include<iostream>
using namespace std;

int Four(int n);

int main()
{
	int Num;

	cout<<"Enter the four digit Number "<<endl;
	cin>>Num;

	int Sum=Four(Num);
	

	cout<<"Addition of the digits is "<<Sum<<endl;
	return 0;

}

int Four(int N)
{
       if(N==0)
	       return 0;
        return(N%10+Four(N/10));
}

