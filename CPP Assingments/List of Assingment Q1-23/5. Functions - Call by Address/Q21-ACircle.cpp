#include <iostream>
using namespace std;

void AreaCircum(float *radius, float *area, float *circum)
{

    *area = 3.14 * *radius * *radius;
    *circum = 2 * 3.14 * *radius;
}

void AreaPeri(float *a, float *b, float *arearec, float *peri)
{
    *arearec = *a * *b;
    *peri = 2 * (*a + *b);
}
int main()
{

    float r, area, circum;
    float num1, num2, arearec, peri;
    int i;
    do
    {
        cout << "Select the shape" << endl;
        cout << "1. Circle" << endl;
        cout << "2. Rectangle" << endl;
        cout << "0. Exit" << endl;
        cin >> i;

        switch (i)
        {
        case 1:
            cout << "Enter the Radius of Circle " << endl;
            cin >> r;
            AreaCircum(&r, &area, &circum);
            cout << "Area of the circle is = " << area << endl;
            cout << "Circumferrence of the circle is = " << circum << endl;
            break;

        case 2:
            cout << "Enter the lenght and breath of rectangle" << endl;
            cin >> num1;
            cin >> num2;
            AreaPeri(&num1, &num2, &arearec, &peri);
            cout << "Area of the Rectangle is = " << arearec << endl;
            cout << "Perimeter of the rectangle is = " << peri << endl;
            break;

        case 0:

            exit(0);
            return 0;
        }
    } while (i != 0);
}
