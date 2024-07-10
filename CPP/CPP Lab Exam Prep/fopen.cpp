#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    fstream file;
    file.open("student.txt", ios::in | ios::out | ios::app);
    if (!file.is_open())
    {
        cout << "Error Opening the file" << endl;
    }
    else
    {
        cout << "File opened " << endl;
        file<< "Writing in the file";
    }
    file.close();
    return 0;
}