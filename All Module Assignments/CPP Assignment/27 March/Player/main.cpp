#include"cktplayer.h"
#include"ftbplayer.h"
#include<iostream>
#include<string>
using namespace std;
int main()
{
    Cktplayer p1("Ruturaj",28,100);
    p1.display();
    // Cktplayer p2;
    // p2.accept();
    // p2.display();
    Ftbplayer f1("Ronaldo",35,2);
    f1.display();
    return 0;
}