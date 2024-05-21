#include <stdio.h>
#include <stdlib.h>

// int def(int arr[])
// {
// 	for (int i=0;i<3;i++)
// 	{
// 		printf("\n%d",arr[i]);
// 	}
// }
// int main()
// {
// 	int arr[3];
// 	for (int i=0;i<3;i++)
// 	{
// 		printf("Enter the value: ");
// 		scanf("%d",&arr[i]);
// 	}
// 	def(arr);
// }

// int def(int *ptr)
// {
// 	for (int i=0;i<4;i++)
// 	{
// 		printf("\n %d", *(ptr+i));
// 	}
// }
// int main()
// {
// 	int arr[]={12,423,5342,1234};
// 	def(arr);
// }

// int main()
// {
// 	const int p=20;
// 	int r=10;
// 	const int *ptr=&p;
// 	int res=p*r*r;
// 	printf("\n area is %d",res);
// 	int **ptr2=&ptr;
// 	 **ptr2=50;
// 	 int res2=p*r*r;
// 	printf("\n area is %d",res2);
// }

// void def(double arr[])
// {
//     printf("\nsize of arr %d",sizeof(arr));
// }
// int main ()
// {
//   int  arr[3]={10,20,30};
//   printf("\n%u",arr);
//   printf("\n%u",*(&arr+1));
//   int *ptr1=&arr[1]; //100+1*4=>104
//   void *ptr=&arr[0];//100+0*4=>100
//   printf("\n%d",*(int*)ptr);
//   int sub=ptr1-(int*)ptr;//(104-100)/4=1
//   printf("\n%d",sub);
//   // printf("\n size of array %d",sizeof(arr));
//   // def(arr);
// }
// void def(char arr[])
// {
//   printf("\nstring=%s",arr);
// }
// int main()
// {
//   // char arr[]={'a','b','c'};
//   // char str[30]={'a','b','c','\0'}; // single charchters only
//   // char str1[5]={'a','b','c'};
//   // str[1]='z'; // can not give words
//   // puts(str);
//   char str2[]="sunbeam infotech";
//   printf("%c\n",str2[2]);
//   puts(str2);
//   str2[2]='0';
//   puts(str2);
//   int len=strlen(str2);
//   printf("\n%d",len);
//   // def(arr);
//   // def(str);
//   // def(str1);
// }

// int main()
// {
//   int arr[3][10] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
//   for(int i=0;i<3;i++)
//   {
//     for(int j=0;j<10;j++)
//     {
//       printf("\t %d",arr[i][j]);
//     }
//     printf("\n");
//   }
//   printf("---------------------------------------------------------------------------------------\n");
//   // printf("array element 1 out add= %u \n", arr); // outer address
//   // printf("array element 1 inner add= %u \n", &arr);
//   // printf("array element 1 inner add= %u \n", *(arr));
//   // printf("array element 1 inner add= %u \n", (arr+0));
//   // printf("array element 1 inner add= %u \n", **(arr+0));
//   // printf("array element 1 inner add= %u \n", **(arr+1));
//   for (int i=0;i<3;i++)
//   {
//     for (int j=0;j<10;j++)
//     {
//     printf("\t %d",*(*(arr+i)+j));
//     }
//     printf("\n");
//   }
// }

// int main()
// {
//   int *ptr = (int *)malloc(3 * sizeof(int));
//   for (int i = 0; i < 3; i++)
//   {
//     printf("Enter:");
//     scanf("%d", (ptr + i));
//   }
//   for (int i = 0; i < 3; i++)
//   {
//     printf("\nElemebts:%d", *(ptr + i));
//   }
//   ptr = (int *)realloc(ptr, 8);
//   for (int i=0;i<8;i++)
//   {
//     printf("Enter: ");
//     scanf("%d",(ptr+i));
//   }
//   for (int i=0;i<8;i++)
//   {
//     printf("\nElemnts:%d",ptr[i]);
//   }
// }


