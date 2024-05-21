/* Create a class named Shape with a function that prints "This is a shape". 
Create another class named Polygon inheriting the Shape class 
with the same function that prints "Polygon is a shape". 
Create two other classes named Rectangle and Triangle having the 
same function which prints "Rectangle is a polygon" and 
"Triangle is a polygon" respectively. Again, make another class 
named Square having the same function which prints "Square is a rectangle".
Now, try calling the function by the object of each of these classes.
*/
#include <iostream>

class Shape {
    public:


  virtual std::string display()
    {
        return "This is a shape";
    }
};


class Polygon : public Shape {
    public:


    std::string display() override
    {
        return "Polygon is a shape";
    }
};
class Rectangle : public Polygon {
    public:


    std::string display() override
    {
        return "Rectangle is a Polygon";
    }
};

class Triangle : public Polygon {
    public:
    std::string display() override
    {
        return "Triangle is a polygon";
    }
};

class Square : public Rectangle {
    public:
    std::string display() override
    {
        return "Square is a rectangle";
    }
};

int main()
{
    Shape s;
    std::cout<<s.display()<<std::endl;
    Polygon p;
   std::cout<< p.display()<<std::endl;
    Rectangle r;
   std::cout<< r.display()<<std::endl;
    Triangle t;
    std::cout<<t.display()<<std::endl;
    Square sq;
   std::cout<<sq.display()<<std::endl;

    return 0;
}