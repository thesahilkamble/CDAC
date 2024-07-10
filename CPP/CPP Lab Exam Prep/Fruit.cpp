#include <iostream>
using namespace std;
#include <string>

class Fruit
{
private:
    string color;
    double weight;
    string name;
    bool fresh;

public:
    Fruit(string color, double weight, string name)
    {
        this->color = color;
        this->weight = weight;
        this->name = name;
        this->fresh = true;
    }

    virtual void display()
    {
        cout << "Name: " << this->name << " Weight: " << this->weight << " Color: " << this->color << endl;
    }
    virtual string taste()
    {
        return "No Specific Taste";
    }

    string getname()
    {
        return this->name;
    }
    string getcolor()

    {
        return this->color;
    }
    double getweight()
    {
        return this->weight;
    }
};

class Apple : public Fruit
{

public:
    Apple(string color, double weight, string name) : Fruit(color, weight, name)
    {
    }

    void jam()
    {
        cout << "Name: " << getname() << " Color: " << getcolor() << " Making Jam" << endl;
    }

    string taste()
    {
        return "Sweet n Sour";
    }
};

class Orange : public Fruit
{

    Orange(string color, double weight, string name) : Fruit(color, weight, name)
    {
    }

    string taste(string s)
    {
        return "Sour";
    }
};

class Mango : Fruit
{

    Mango(string color, double weight, string name) : Fruit(color, weight, name)
    {
    }

    string taste(string s)
    {
        return "Sweet";
    }
};

int main()
{
    Apple a("Red", 200, "Kashmiri");

    a.display();
    a.jam();

    return 0;
}