#include<iostream>
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

		//CTOR
		Student()
	       	{
		cout<<"\n CTOR called"<<endl;
		count++;

		rollNo =0;
		name = "";
		marks = 0;
		}
		
		Student(int rno, string nm, int mk)
	       	{
		cout<<"\n PARAM CTOR called"<<endl;
		count++;
		rollNo = rno;
		name = nm;
		marks = mk;
		}

		int getRollNo()
		{
			return rollNo;
		}

		void accept()
		{
			cout<<"\n Enter rollNo:"<<endl;
			cin>>rollNo;
			cout<<"\n Enter name:"<<endl;
			cin.get();
			getline(cin, name);
			cout<<"\n Enter Marks:"<<endl;
			cin>>marks;

		}

		void display() const
		{
			//this=NULL;
			//this->name = "Alia";
cout<<"\n this="<<this;
cout<<"\nRollNo:"<<this->rollNo<<" Name:"<<this->name<<" Marks:"<<marks<<endl;

		}
		void doStudy()
		{
			cout<<"\n Student is studying::"<<rollNo<<endl;
		}

		static void printCount()
		{
		cout<<"\n Count="<<count; 
		}

};
//Static variable init
int Student::count =0;

void sortStudents(Student arr[], int length)
{
	for(int i=0 ; i < length; i++)
	{
		for(int j = i+1 ; j < length; j++)
		{
		if(arr[i].getRollNo() > arr[j].getRollNo()) {
		Student temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
	}
}

int main()
{
	/*//Default ctor
	Student s;
	s.display();
*/
	//Param ctor
	Student s1(5,"Ram", 100);
	cout<<"\n Addr of Ram="<<&s1;
	s1.display();

/*	Student *sptr = &s;
	//(*sptr) =>s
	(*sptr).display();
	sptr->display();

	Student *sptr1 = new Student;
	sptr1->display();
	delete sptr1;

	Student *sptr2 = new Student(2,"sham", 200);
	sptr2->display();
	delete sptr2;

	Student *sptr3 = new Student[3];
	sptr3[0].display();
	sptr3[1].display();
*/
	const Student s2(10,"Kriti", 100);
	cout<<"\n Addr of Kriti="<<&s2;
	//s2.accept();
	s2.display();
	Student::printCount();
	//s2.printCount();


/*	s.accept();
	s.doStudy();
	s.display();


	int size =3;
	Student sarr[size];
	for( int i =0; i < size; i++)
	{
	sarr[i].accept();
	}

	for( int i =0; i < size; i++)
	{
	sarr[i].display();
	}

	sortStudents(sarr, size);
cout<<"\n *******************************"<<endl;
	for( int i =0; i<size; i++)
	{
	sarr[i].display();
	}*/
	return 0;
}
