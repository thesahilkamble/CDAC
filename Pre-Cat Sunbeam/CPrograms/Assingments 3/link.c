#include <stdio.h>
#include <stdlib.h>

struct node *C_node(int data);
struct node *head = NULL;
void A_node(int data);
void L_node(int data);
void mid_node(int data, int pos);
void del_last();
void del_first();
void del_pos(int pos);
void display();

struct node
{
    int data;
    struct node *next;
};

int main()
{
    A_node(10);
    A_node(20);
    L_node(30);
    L_node(40);
    mid_node(100, 3);
    display();
    return 0;
}

struct node *C_node(int data)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    if (ptr == NULL)
        printf("Memory not created");
    else
    {
        ptr->data = data;
        ptr->next = NULL;
    }
    return ptr;
}

void A_node(int data)
{
    struct node *ptr = C_node(data);

    if (head == NULL)
    {
        head = ptr;
    }
    else
    {
        ptr->next = head;
        head = ptr;
    }
}

void L_node(int data)
{
    struct node *ptr = C_node(data);

    if (head == NULL)
    {
        head = ptr;
    }
    else
    {
        struct node *temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = ptr;
    }
}

void mid_node(int data, int pos)
{
    struct node *ptr = C_node(data);
    struct node *temp = head;

    if (head == NULL || pos <= 1)
    {
        A_node(data);
    }
    else
    {
        for (int i = 0; i < pos - 1; i++)
        {
            if (temp->next == NULL)
                break;
            temp = temp->next;
        }
        ptr->next = temp->next;
        temp->next = ptr;
    }
}

void display()
{
    if (head == NULL)
        printf("List is Empty !");
    else
    {
        struct node *temp = head;
        printf("head");
        while (temp != NULL)
        {
            printf("->%d", temp->data);
            temp = temp->next;
        }
    }
}

void del_first()
{
    if (head == NULL)
        printf("list is empty!!");

    else if (head->next == NULL)
    {
        free(head);
        head = NULL;
    }
    else
    {
        struct node *temp = head;
        head = head->next;
        free(temp);
        temp = NULL;
    }

}

void del_last()
{
    if (head==NULL)
    printf("list is empty!!");

    else if(head->next==NULL)
     {
        free(head);
        head = NULL;
    }
    else
    {
        struct node *temp=head;
        while (temp->next->next!=NULL)
        {
            temp=temp->next;
        }
        free(temp->next);
        temp->next=NULL;
    }
}

void del_pos(int pos)
{

   if (head==NULL)
    printf("list is empty!!");

    else if(pos<=1)
     {
        del_first();
     }
}