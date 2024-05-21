#include<iostream>
using namespace std;

int main()
{
    char c;
    cout<<"Enter a Charachter"<<endl;
    cin>>c;
    int x=(c);
    if(x>=65 && x<=90)
    cout<<"Entrered Charachter "<<c<<" is "<<char(x+32)<<endl;
    else if(x>=97 && x<=112)
    cout<<"Entrered Charachter "<<c<<" is "<<char(x-32)<<endl;
    else
    cout<<"Entered Value is not an alphabet"<<endl;

 return 0;   
}