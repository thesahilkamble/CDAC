#include<iostream>
using namespace std;

/*int avg(int n)
{


}*/


int main()
{
	int n;
	int sum=0;
	int avg;

	int arr[n];
	cout<<"Enter the number of numbers to be added"<<endl;
	cin>>n;

	for(int i=0;i<n;i++)
	{
	cin>>arr[i];
	}

	for(int i=0;i<n;i++)
	{
	
		sum=sum+arr[i];
	
	}

	avg=sum/n;

	cout<<avg;


	return 0;
}

