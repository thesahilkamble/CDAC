#ifndef FTBPLAYER_A
#define FTBPLAYER_A
#include<string>
#include"player.h"
using namespace std;
class Ftbplayer :public Player
{
    private:
        int goals;
    public:
        Ftbplayer();
        Ftbplayer(string name,int age,int goals);
        void accept();
        void display();
};
#endif