#include<stdio.h>
#define SIZE 50

struct Student
{
	int rno;
	char name[SIZE];
};

typedef struct Student STUDENT;

void getData(STUDENT *sp){
	printf("\n Please enter roll number of student\n");
	scanf("%d", &sp->rno);
	printf("\n Please enter name of student\n");
	scanf("%s", sp->name);
}

void printData(STUDENT *sp){
	printf("\n Student details");
	printf("\nRNO=%d\tName=%s", sp->rno, sp->name);
}
int main()
{
	struct Student s;
	STUDENT s1;
	
	printf("\n Please enter roll number of student\n");
	scanf("%d", &s.rno);
	printf("\n Please enter name of student\n");
	scanf("%s", s.name);
	
	printf("\n Student details");
	printf("\nRNO=%d\tName=%s", s.rno, s.name);
	
	getData(&s1);
	printData(&s1);
	
	return 0;
}