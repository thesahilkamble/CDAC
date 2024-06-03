#include <iostream>
using namespace std;

class Value
{
    float val;

public:
    Value()
    {
        val = 0;
    }

    Value(int n)
    {
        val = n;
    }

    float operator+(Value &a)
    {
        return val + a.val;
    }

    float operator-(Value &a)
    {
        return val - a.val;

    }

    float operator*(Value &a)
    {
        return val * a.val;
  
    }

    float operator/(Value &a)
    {
        return val / a.val;
    }

    void operator=(Value const &a)
    {
        val = a.val;
    } 
    friend ostream& operator<<(ostream& os, Value& v);
};

ostream& operator<<(ostream& os, Value &v)
{
    os << v.val;
    return os;
}

int main()
{
    Value v1(10), v2(20),v3;

    v3 = (v1+v2);

    cout<<v3;

   

    return 0;
}