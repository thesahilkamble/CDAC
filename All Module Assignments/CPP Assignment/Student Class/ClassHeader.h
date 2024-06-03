#include<string>
using namespace std;

class student
{

private:
	int RollNo;
	int Marks;
	string name;

public:
	int getRollNo();
	int getMarks();
	string getname();
	void accept();
	void display();
  
    student()
    {
        RollNo=0;
        name=" ";
        Marks=0;
    }

	
};

void sortbyrollno(student arr[], int length);
void sortbymarks(student arr[], int length);
void sortbyname(student arr[], int length);
