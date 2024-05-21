#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    ifstream fin("stud.txt");
    if (!fin.is_open())
    {
        cout << "Error Opening the file" << endl;
    }
    else
    {
        string line;
        while(fin.eof())
        {

        getline(fin,line);
        cout<<line;
        }
        fin.close();
    }
   
    return 0;
}