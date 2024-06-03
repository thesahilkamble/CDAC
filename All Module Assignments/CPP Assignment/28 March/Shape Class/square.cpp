#include "square.h"
float Square::CalcArea()
{
  float area = side*side;
  return area;
}

float Square::CalcPeri()
{
  float peri = 4*side;
  return peri;
}

void Square::Accept()
{
  cout<<"\n Enter Side "<<endl;
  cin>>side;
}

// void Square::Display()
// {
//   cout<<"\n Side:="<<side<<endl;
// }

