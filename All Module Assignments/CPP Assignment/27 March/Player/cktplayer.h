#ifndef CKTPLAYER_A
#define CKTPLAYER_A
#include<string>
#include"player.h"
using namespace std;
class Cktplayer :public Player
{
    private:
        int runs;
    public:
        Cktplayer();
        Cktplayer(string name,int age,int runs);
        void accept();
        void display();
};
#endif
