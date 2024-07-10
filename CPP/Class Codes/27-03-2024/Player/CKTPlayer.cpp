#include "Player.cpp"
class CKTPlayer: public Player
{
private:
int runs;

public:
CKTPlayer():runs(0)
{
cout<<"\n CKTPlayer::CKTPlayer()"<<endl;
}

void Accept()
{
Player::Accept();
cout<<"\n Enter Runs:";
cin>>runs;
}

void Display()
{
Player::Display();
cout<<"\nRuns:"<<runs;
}


};
int main()
{
/*	Player p;
	p.Accept();
	p.Display();
	CKTPlayer c;
	c.Accept();
	c.Display();
*/

Player *pp = NULL;
/*Player p;
pp = &p;
pp->Accept();
pp->Display();
*/
/*CKTPlayer cp;
CKTPlayer *cpp = &cp;
cpp->Display();
*/
CKTPlayer cp;
pp = &cp;

cout<<"Call for p"<<endl;
pp->Accept();
pp->Display();

return 0;
}
