#include <stdio.h>
#define SIZE 10

void in_sort(int arr[SIZE]);
void display(int arr[SIZE]);

int main()
{
    int arr[SIZE] = {33, 66, 44, 55, 11, 22, 77, 99, 88, 100};

    printf("\nBefore\n");
    display(arr);
    in_sort(arr);
    printf("\nAfter\n");
    display(arr);

    return 0;
}

void in_sort(int arr[SIZE])
{
    int i, j, key;
    for (i = 1; i < SIZE; i++)
    {
        j = i - 1;
        key = arr[i];

        while (j >= 0 && key < arr[j])
        {

            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

void display(int arr[SIZE])
{
    for (int index = 0; index < SIZE; index++)
    {
        printf("%4d", arr[index]);
    }
}