#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	//setw for output
	cout << setw(10);
	cout << 1234 << endl;
	cout << left<<1234 << endl;
	cout << right<<1234 << endl;
	cout << internal<<1234 << endl;
	
	//Set precision for floating point numbers
	double f =3.14159;
	cout << scientific;
	cout << setprecision(5) << f << '\n';
	cout << setprecision(9) << f << '\n';
	cout << fixed; // for fixed precision
	cout << setprecision(5) << f << '\n';
	cout << setprecision(9) << f << '\n';
  
  
	//For printing hex
    cout << hex;
	cout << setiosflags (ios::showbase | ios::uppercase);
	cout << 100 << endl;
  
  //Fill by *
	cout << setfill ('*') << setw (10);
	cout << 71234 << endl;
  
  //Setting base
	cout << setbase(16);
	cout << 110 << endl;
  
  //Set Hex
    cout << hex << setiosflags (ios::showbase);
    cout << 100 << endl;
    cout << resetiosflags(ios::showbase) << 100 << endl;
	
	//c++11 function for money
	cout << "Please, enter the price: ";
	cin >> get_money(price);

	if (cin.fail()) cout << "Error reading price\n";
	else cout << "The price entered is: " << price << '\n';
   
	cout << "Price:" << put_money(1.5L) << '\n'
	cout << "Price:" << put_money(1.5L,true) << '\n'
	return 0;
}