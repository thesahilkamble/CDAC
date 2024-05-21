#include<iostream>
using namespace std;

int main()
{
    float BS,TS,NS,Com;
    cout<<"Enter Basic Salary"<<endl;
    cin>>BS;
    cout<<"Enter Total Sales Amount"<<endl;
    cin>>TS;

    if(TS>=5000 && TS<=7500)
    {
    Com=0.3*TS;
    cout<<"You get "<<Com<<"Commission"<<endl;
    }
    else if(TS>=7501 && TS<=10500)
    {
    Com=0.8*TS;
    cout<<"You get "<<Com<<"Commission"<<endl;
    }
    
    else if (TS>=10501 && TS<=1500)
    {
        Com=0.11*TS;
    cout<<"You get "<<Com<<"Commission"<<endl;
    }

    else if (TS>=1500)
     {   Com=0.15*TS;

        cout<<"You get "<<Com<<"Commission"<<endl;
    }

    else
    cout<<"No Commision for you!"<<endl;

    return 0;
}