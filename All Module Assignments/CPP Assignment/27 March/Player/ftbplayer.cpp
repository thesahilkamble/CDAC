#include"ftbplayer.h"
#include"player.h"
#include<iostream>
#include<string>
using namespace std;

Ftbplayer::Ftbplayer()
{
    goals=0;
}

Ftbplayer::Ftbplayer(string n,int a,int g): Player(n, a)
{
    goals=g;
}

void Ftbplayer::accept()
{
    Player::accept();
    cout<<"Enter goals"<<endl;
    cin>>goals;
}

void Ftbplayer::display()
{
    Player::display();
    cout<<goals<<endl;
}