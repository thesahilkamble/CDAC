#ifndef STUDENT_H
#define STUDENT_H
#include<string>
using namespace std;
class Student
{
	private:
		int rollNo;
		string name;
		int marks;
		static int count;
	public:
		Student();
		Student(int rno, string nm, int mk);
		int getRollNo();
		void accept();
		void display() const;
		void doStudy();
		static void printCount();
		~Student();

};
#endif
