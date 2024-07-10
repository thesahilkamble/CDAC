#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ofstream fout("stud.txt");
    if (!fout.is_open())
    {
        cout << "Error Opening the file" << endl;
    }
    else
    {
        fout << "File opened, we are writing this in file from ofstream cpp " << endl;
        fout.close();
    }
   
    return 0;
}