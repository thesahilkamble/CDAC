#include <iostream>
using namespace std;

int CharLine(char ch, char nu)
{
	for (int i = 0; i < nu; i++)
		cout << ch;
	cout << endl;
	return 0;
}

int main()
{
	char c;
	int n;

	cout << "Enter the charchter for making line" << endl;
	cin >> c;
	cout << "Enter the length of line" << endl;
	cin >> n;
	CharLine(c, n);
	cout << "Data type : Size " << endl;
	CharLine(c, n);
	cout << "short int : " << sizeof(short int) << endl;
	CharLine(c, n);
	cout << "int : " << sizeof(int) << endl;
	CharLine(c, n);
	cout << "long int : " << sizeof(long int) << endl;
	CharLine(c, n);
	cout << "float : " << sizeof(float) << endl;
	CharLine(c, n);
	cout << "double : " << sizeof(double) << endl;
	CharLine(c, n);
	cout << "long double : " << sizeof(long double) << endl;
	CharLine(c, n);
	cout << "bool : " << sizeof(bool) << endl;
	CharLine(c, n);
	cout << "char : " << sizeof(char) << endl;
	CharLine(c, n);
	return 0;
}
