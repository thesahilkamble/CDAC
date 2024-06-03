#include"swap.h"
#include<iostream>
using namespace std;
 int main()
{  

int x, y;
float i,j;

accept(x,y);
display(x,y);

swapping obj;
obj.swap(x,y);
display(x,y); 

accept(i,j);
display(i,j);

swapping obj1;
obj1.swap(i,j);

display(i,j); 
obj1.swap(i,j);
display(i,j); 
}
