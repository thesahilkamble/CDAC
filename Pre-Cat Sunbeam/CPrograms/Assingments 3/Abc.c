#include <stdio.h>
#define SIZE 10
#define SWAP(a, b) \
    {              \
        int t;     \
        t = a;     \
        a = b;     \
        b = t;     \
    }

int bubble_sort(int arr[SIZE])
{
    int pos, it, flag=0;

    for (it = 0; it < SIZE - 1; it++)
    {
        for (pos = 0; pos < SIZE - 1 - it; pos++)
        {

            if (arr[pos] > arr[pos + 1])
            {

                SWAP(arr[pos], arr[pos + 1]);
            }
        }
    }
}

int main()
{
    int arr[SIZE] = {66, 11, 33, 88, 99, 22, 77, 44, 55, 100};
    printf("Before Sorting\n");
    for (int i = 0; i < SIZE; i++)
    {
        printf("%d  ", arr[i]);
    }

    bubble_sort(arr);

    printf("\nAfter Sort\n");

    for (int i = 0; i < SIZE; i++)
    {
        printf("%d  ", arr[i]);
    }

    return 0;
}