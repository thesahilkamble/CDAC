#include<stdio.h>

// int main ()
// {
//     int num=5,i=1;

    // do
    // {
    //     printf("\n%d",num*i);
    //     i++;
    // } while (i<=10);

    // while (i<=10)
    // {
    //     printf("\n%d",num*i);
    //     i++;
    // }
    
    // for ( ; i<=10; )
    // {
    //     printf("\n%d",num*i);
    //     i++;
    // }
    
//   __|_|__
//   __|_|__
//     | | 
// }
    
int main ()
{
    int a,b,c,d,e,r;
    char ch;

    printf("lets play a game of tic tac toe");
    printf("\n_|_|_ \n_|_|_ \n | | ");

    printf("\nYou play the first move?[y/n]");
    scanf("%*c%c", &ch);

    if (ch=='y')
    {
        printf("\n1|2|3 \n4|5|6 \n7|8|9 \nMention the place number you want to place your mark: ");
        scanf("%d",&a);
    }

    else
    {
      
      printf("\n1|2|3 \n4|X|6 \n7|8|9 \nMention the place number you want to place your mark");
      scanf("%d",&a);

    }
    

    printf("\n1|2|3 \n4|5|6 \n7|8|9 \nMention the place number you want to place your mark");
    scanf("%d",&a);
        
        switch (a)
        {
        case 1:
            printf("\nX|_|_ \n_|_|_ \n | | ");
            break;
         case 2:
            printf("\n_|X|_ \n_|_|_ \n | | ");
            break;
         case 3:
            printf("\n_|_|X \n_|_|_ \n | | ");
            break;
         case 4:
            printf("\n_|_|_ \nX|_|_ \n | | ");
            break;
         case 5:
            printf("\n_|_|_ \n_|X|_ \n | | ");
            break;
         case 6:
            printf("\n_|_|_ \n_|_|X \n | | ");
            break;
         case 7:
            printf("\n_|_|_ \n_|_|_ \nX| | ");
            break;
         case 8:
            printf("\n_|_|_ \n_|_|_ \n |X| ");
            break;
         case 9:
            printf("\n_|_|_ \n_|_|_ \n | |X");
            break;
        default:
            break;
        }




}