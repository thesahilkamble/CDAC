#include"cktplayer.h"
#include"player.h"
#include<iostream>
#include<string>
using namespace std;

Cktplayer::Cktplayer()
{
    runs=0;
}

Cktplayer::Cktplayer(string n,int a,int r): Player(n, a)
{
    runs=r;
}

void Cktplayer::accept()
{
    Player::accept();
    cout<<"Enter Runs"<<endl;
    cin>>runs;
}

void Cktplayer::display()
{
    Player::display();
    cout<<runs<<endl;
}