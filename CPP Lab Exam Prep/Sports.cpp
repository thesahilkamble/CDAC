#include <vector>
#include <string>
#include <iostream>
using namespace std;

class sports
{

private:
    string sports_name;
    double fees;

public:
    // sports() : sports_name(" "), fees(0.0) {}

    sports(string name, double fee) : sports_name(name), fees(fee) {}

    string getsportsname()
    {
        return sports_name;
    }
};

class person 
{
private:
    string name;
    int age;

public:
    // person() : sports(name, fees), name(" "), age(18) {}

    person(string name, double fee, string pname, int age) : name(pname), age(age) {}
};

class player
{

private:
    int id;
    int mobile;
    sports s;

public:
    player(int id, int mobile, string name, double fee ) : s(name,fee), id(id), mobile(mobile) {}

    void display()
    {
        cout<<id<<mobile;
    }
};

int main()
{

vector<player *> Players;
 
    int choice;
    bool exit = false;

    while (!exit)
    {

        cout << "\n 1. Add New Player \n 2. Add New Sport \n 3. Enrol player in sport \n 4. Display player sports list \n 5. Display all player and sports registred \n Enter choice: ";
        cin >> choice;

        switch (choice)
        {

        case 1:
        Players.push_back(new player(10,982678936, "Vaibhav", 25000));
        break;
        case 2:
        break;
        case 3:
        break;
        case 4:
        break;
        case 5:
        for (player *p : Players)
        {
            p->display();
        }

        break;

        case 0:
        exit = true;
        break;

        default:
        cout<<"Invalid option selected "<<endl;
        break;
        }
    }

    return 0;
}