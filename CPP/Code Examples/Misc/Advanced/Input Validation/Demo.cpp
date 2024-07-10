#include <iostream>
#include <limits>
using namespace std;


//program for validating no
int main() 
{
  int number = 0;
  cout << "Enter an integer: ";
  cin >> number;
  cin.ignore(numeric_limits<int>::max(), '\n');

  if (!cin || cin.gcount() != 1)
    cout << "Not a numeric value.";
  else
    cout << "Your entered number: " << number;
  
  return 0;
}
