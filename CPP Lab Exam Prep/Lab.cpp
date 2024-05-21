#include <iostream>
#include <string>
using namespace std;

class Vehicle
{
private:
    string VehicleType;
    double Cost;

public:
    Vehicle(string name, double Cost) : VehicleType(name), Cost(Cost) {}

    double getCost()
    {
        return Cost;
    }
    virtual string getDetails() = 0;
    virtual double CalculatePremium() = 0;
};

class Car : public Vehicle
{
public:
    Car(double Cost) : Vehicle("C", Cost) {}

    double CalculatePremium()
    {
        return getCost() * 0.02;
    }

    string getDetails() override
    {

        return "Car";
    }
};

class Bike : public Vehicle
{
public:
    Bike(double Cost) : Vehicle("B", Cost) {}

    double CalculatePremium()
    {
        return getCost() * 0.01;
    }

    string getDetails() override
    {

        return "Bike";
    }
};

class Truck : public Vehicle
{

public:
    Truck(double Cost) : Vehicle("B", Cost) {}

    double CalculatePremium()
    {
        return getCost() * 0.03;
    }

    string getDetails() override
    {

        return "Truck";
    }
};

int main()
{
    char Type;
    double Cost;

    // cout << "\nB for Bike\nC for Car\nT for Truck\nE for Exit\nEnter type of Vehicle: ";
    // cin >> Type;
    // cout << "Enter Cost of Vehicle: ";
    // cin >> Cost;
    Vehicle *vehicle;
    bool exit = false;

    while (!exit)
    {
         cout << "\nB for Bike\nC for Car\nT for Truck\nE for Exit\nEnter type of Vehicle: ";
    cin >> Type;
    cout << "Enter Cost of Vehicle: ";
    cin >> Cost;
        switch (Type)
        {
        case 'B':
            vehicle = new Bike(Cost);
            break;
        case 'C':
            vehicle = new Car(Cost);
            break;
        case 'T':
            vehicle = new Truck(Cost);
            break;
        case 'E':
            exit = true;
            break;
        default:
            cout << "Invalid Vehicle type." << endl;
            return 1;
        }
    }
    cout << "Vehicle type = " << vehicle->getDetails() << ". Premium @ % " << vehicle->CalculatePremium() << endl;

    delete vehicle;

    return 0;
}