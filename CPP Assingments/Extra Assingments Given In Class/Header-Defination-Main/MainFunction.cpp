#include "HeaderFile.h"
#include <iostream>
using namespace std;

int main()
{

  float num1;
  float num2;
  int i;
  do
  {
    cout << "Select the operation to be performed" << endl;
    cout << "1. Addition" << endl;
    cout << "2. Subtraction" << endl;
    cout << "3. Multiplication" << endl;
    cout << "4. Division" << endl;
    cout << "0. Exit" << endl;
    cin >> i;

    switch (i)
    {
    case 1:
      cout << "Enter the two numbers " << endl;
      cin >> num1;
      cin >> num2;

      add(num1, num2);
      break;
    case 2:
      cout << "Enter the two numbers " << endl;
      cin >> num1;
      cin >> num2;
      sub(num1, num2);
      break;

    case 3:
      cout << "Enter the two numbers " << endl;
      cin >> num1;
      cin >> num2;
      multi(num1, num2);
      break;

    case 4:
      cout << "Enter the two numbers " << endl;
      cin >> num1;
      cin >> num2;
      divi(num1, num2);
      break;

    case 0:

      exit(0);
      return 0;
    }
  } while (i != 0);
}
