#include<iostream>
using namespace std;


int FiboRec(int n)
{
	if(n==0)
		return 0;
	if(n==1)
		return 1;
	else

	return(FiboRec(n-1)+FiboRec(n-2));
}
int main()

{
      int num;
      cout<<"Enter the number: ";
      cin>>num;
      cout<<"Fibonacci Series: ";
      for(int i=0;i<=num;i++)
      {
	      cout<<FiboRec(i);
      }
      return 0;
}
