#ifndef CERT_H
#define CERT_H
#include<string>
using namespace std;

class Certificate
{
	private:
	 string certNo;
	 string Name;
	 string issueDate;
	public:
	 Certificate();
	 Certificate(string a,string b,string c);
	 void accept();
	 void display();
	 
};
#endif
