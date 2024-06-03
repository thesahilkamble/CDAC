#include"player.h"
#include<iostream>
using namespace std;

Player::Player()
{
    name="Shiv";
    age=25;
}

Player::Player(string n,int a)
{
    name=n;
    age=a;
}

void Player:: accept()
{
    cout<<"Enter Name And Age"<<endl;
    cin>>name>>age;
}

void Player:: display()
{
    cout<<name<<" "<<age<<endl;
}