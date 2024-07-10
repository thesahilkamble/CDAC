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
Player p;
cout<<"\n Size of Player="<<sizeof(p);
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
cp.Display();

//Upcasting
pp = &cp;
cout<<"Call for pp"<<endl;
pp->Accept();
pp->Display();

//Upcasting
Player &pref = cp;
pref.Display();

return 0;
}
