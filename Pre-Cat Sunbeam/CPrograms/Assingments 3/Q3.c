#include <stdio.h>

int main()
{
    int arm, num, a, b, c, d;

    printf("Enter a four digit number: ");
    scanf("%d", &num);

    a = num / 1000;
    b = (num - a * 1000) / 100;
    c = (num - a * 1000 - b * 100) / 10;
    d = (num - a * 1000 - b * 100 - c * 10);

    printf("%d+%d+%d+%d= %d", a, b, c, d, a + b + c + d);

    printf("\nReverse Number is: %d%d%d%d", d, c, b, a);

    if (a == d && b == c)
    {
        printf("\nGiven number %d is palindrom number", num);
    }

    else
    {
        printf("\nGiven number %d is not a palindrom number", num);
    }

    arm = (a * a * a) + (b * b * b) + (c * c * c) + (d * d * d);

    if (arm = num)
    {
        printf("\nGiven numbers is armstrong number");
    }

    else
    {
        printf("\nGiven number is not a armstrong number");
    }
}