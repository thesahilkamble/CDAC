
#include <iostream>
#include <string>
#include <sstream>
using namespace std;
// To validate only number
int main(void)
{
  std::string response;

  int value;
  while(1)
  {
    cout << "Enter an integer number: ";
    cin >> response;
    // convert to integer using a stringstream
    std::istringstream convert(response);
    
    if ( convert >> value )
    {
      break;
    }              
  }
 cout << "value = " << value << std::endl;
 return 0;
}
