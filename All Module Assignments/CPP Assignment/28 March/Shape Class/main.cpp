#include "rect.h"
#include "circle.h"
#include "square.h"
int main()
{
	float area;
	float peri;
	Circle c;
	Rect r;
	Square sq;
	Shape *s2 = NULL;

	int ch = 0;

	cout << "1 for area and perimeter of rectangle: " << endl;
	cout << "2 for area and perimeter of circle: " << endl;
	cout << "3 for area and perimeter of square: " << endl;
	cout << "4 for exit: " << endl;
	cout << "Enter your choice: " << endl;
	cin >> ch;

	do
	{

		switch (ch)
		{
		case 1:

			s2 = &r;
			s2->Accept();
			area = s2->CalcArea();
			peri = s2->CalcPeri();
			cout << "\n Area is =" << area;
			cout << "\n Perimeter is =" << peri << endl;
			break;

		case 2:

			s2 = &c;
			s2->Accept();
			area = s2->CalcArea();
			peri = s2->CalcPeri();
			cout << "\n Area is =" << area;
			cout << "\n Perimeter is =" << peri << endl;
			break;

		case 3:

			s2 = &sq;
			s2->Accept();
			area = s2->CalcArea();
			peri = s2->CalcPeri();
			cout << "\n Area is =" << area;
			cout << "\n Perimeter is =" << peri << endl;
			break;

		case 4:
			exit(0);

		default:

			cout << "Invalid choice. Please enter again" << endl;
		}
		cout << "Enter your choice: " << endl;
		cin >> ch;
	} while (ch != 4);

	// Shape *s = NULL;
	// Rect r;
	// Circle c;
	// Square sq;
	// //Rectanle function
	// s = &r; // upcasting
	// s->Accept();
	// float a= s->CalcArea();
	// cout<<"\n Area is ="<<a;

	// //Circle function
	// s = &c; // upcasting
	// s->Accept();
	// a= s->CalcArea();
	// cout<<"\n Area is ="<<a;
	// // Square Functon
	//  s=&sq;
	//  s->Accept();
	//  a= s->CalcArea();

	//  cout<<"\n Area is ="<<a;

	return 0;
}