/*
We want to store the information of different vehicles. Create a class named Vehicle
with two data member named mileage and price. Create its two subclasses
*Car with data members to store ownership cost, warranty (by years),
seating capacity and fuel type (diesel or petrol).
*Bike with data members to store the number of cylinders, number of gears,
cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car
(i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.)
Do the same for a Bajaj and a TVS bike
*/

#include <iostream>
class Vehicle
{
protected:
    double Mileage;
    double Price;
    public:
    Vehicle(double Mileage, double Price) : Mileage(Mileage), Price(Price) {}
};
class Car : public Vehicle
{
protected:
    double OwnershipCost;
    double Warranty;
    int SeatingCapacity;
    std::string FuelType;
    public:
    Car (double Mileage, double Price, double OwnershipCost, double Warranty, 
    int SeatingCapacity, std::string FuelType) : Vehicle(Mileage,Price), 
    OwnershipCost(OwnershipCost), Warranty(Warranty), SeatingCapacity(SeatingCapacity) {}
};
class Bike : public Vehicle
{
protected:
    int Cylinders;
    int Gears;
    std::string CoolingType;
    std::string WheelType;
    int FuelTankSize;
   Bike (double Mileage, double Price, int Cylinders, int Gears,
    std::string CoolingType, std::string WheelType, int FuelTankSize) : 
    Vehicle(Mileage,Price), Cylinders(Cylinders), Gears(Gears), 
    CoolingType(CoolingType), WheelType(WheelType), FuelTankSize(FuelTankSize) {}
};
class Audi : public Car
{
protected:
    std::string ModelType;
    public: 
    Audi (std::string ModelType) : Car(), ModelType(ModelType) {}
};
class Ford : public Car
{
protected:
    std::string ModelType;
};
class Bajaj : public Bike
{
protected:
    std::string MakeType;
};
class Tvs : public Bike
{
protected:
    std::string MakeType;
};