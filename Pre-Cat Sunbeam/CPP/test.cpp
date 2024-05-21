include<iostream>

using namespace std;

void SWAP(int &n1, int &n2)
{
n1=n1*n2;

n2=n1/n2;

n1=n1/n2;
}
int main()

{

int no1=1,no2=0;

cout<<" no1="<<no1<<" no2="<<no2<<endl;

SWAP(no1, no2);

cout<<" no1="<<no1<<" no2="<<no2<<endl; 

return 0;

}
