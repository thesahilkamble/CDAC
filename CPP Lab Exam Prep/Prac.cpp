#include <iostream>
#include <string>
using namespace std;

void menu();

class Person
{
private:
    string name;

public:
    Person(string name) : name(name) {}
};

class Seller : public Person
{
private:
    string seller_name;
    int id;

    Seller(string s_name, int id) : Person(s_name), id(id) {}
};

class Product : public Person
{
private:
    int id;
    string product_name;
    double price;

public:
    Product(int id, string pname, double cost) : Person(pname), id(id), price(cost) {}
};

int main()
{
    int option;
    bool exit = false;

    while (!exit)

    {
        menu();
        cout << "Enter option: ";
        cin >> option;

        switch (option)
        {
        case 1:
        {
            

            break;
        }

        case 2:
        {

            break;
        }
        case 3:
        {

            break;
        }
        case 4:
        {

            break;
        }
        case 5:
        {

            break;
        }
        case 0:
        {
            exit = true;
            cout<<"Program terminated"<<endl;
            break;
        }
        default:

        {

            cout << "Invalid Option!";
            break;
        }

        }
    }
 
    return 0;


}

void menu()
{
    cout << "\n1. Add Seller\n 2.Add Product\n 3.Display products sold by specific seller\n 4.Display all sellers\n 5.Display all sellers\n 0. exit" << endl;
}


 
