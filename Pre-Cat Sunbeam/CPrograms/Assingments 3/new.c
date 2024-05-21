#include <stdio.h>
#define SIZE 9

int binary_search(int arr[SIZE], int key);

int main()
{
    int arr[SIZE] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
    int key;
    printf("Enter the key to search :");
    scanf("%d", &key);

    int index = binary_search(arr, key);

    if (index == -1)
        printf("Key not Found !!\n");
    else
        printf("Key is found at index %d\n", index);

    // printf("comparisons = %d\n",comparisons);
    return 0;
}

int binary_search(int arr[SIZE], int key)
{
    int right = SIZE - 1;
    int left = 0;
    int mid = (left+right)/2;

    for (int i = 0; i < SIZE; i++)
    {
        if (key == arr[mid])
            return mid;

        if (key > arr[mid])
        {
            left = mid + 1;
            mid = (left + right) / 2;
        }

        if (key < arr[mid])
        {
            right = mid - 1;
            mid = (left + right) / 2;
        }
        
        
    }
            return -1;
}
