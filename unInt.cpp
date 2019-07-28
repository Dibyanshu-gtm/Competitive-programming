#include <iostream>
#include<bits/stdc++.h>
using namespace std;
struct Node
{
    int data;
    struct Node* next;
};
void push(struct Node** head_ref,int rdata)
{
    struct Node* new_node=(struct Node*)malloc(sizeof(struct Node));
    new_node->data=rdata;
    new_node->next = (*head_ref);
    (*head_ref)=new_node;
}
void storeEle(Node* head1,Node* head2, unordered_map<int,int> &eleoc)
{
    Node* temp1=head1;
    Node* temp2=head2;
    while(temp1!=NULL && temp2!=NULL)
    {
        if(temp1!=NULL)
        {
            eleoc[temp1->data]++;
            temp1=temp1->next;
        }
        
        if(temp2!=NULL)
        {
            eleoc[temp2->data]++;
            temp2=temp2->next;
        }
    }
}
struct Node* getIntersection(unordered_map<int,int> eleoc)
{
    struct Node* result= NULL;
    for(auto it=eleoc.begin();it!=eleoc.end();it++)
    {
        if(it->second==2)
        {
            push(&result,it->first);
        }
    }
    return result;
}
struct Node* getunion(unordered_map<int,int> eleoc)
{
    struct Node* result= NULL;
    for(auto it=eleoc.begin();it!=eleoc.end();it++)
    {
        push(&result,it->first);
        
    }
    return result;
}
void print(Node * node)
{
    while(node!=NULL)
    {
        cout<<node->data<<"->";
        node=node->next;
    }
}
void printunint(Node * head1,Node * head2)
{
    unordered_map<int,int> eleoc;
    storeEle(head1,head2,eleoc);
    
    
    Node* intersectionlist= getIntersection(eleoc);
    Node* unionlist= getunion(eleoc);
    
    cout<<"\nIntersection list\n";
    print(intersectionlist);
    cout<<"\nUnion list\n";
    print(unionlist);
    
}

int main() {
	/* Start with the empty list */
    struct Node* head1 = NULL; 
    struct Node* head2 = NULL; 
  
    /* create a linked list*/
    push(&head1, 1); 
    push(&head1, 2); 
    push(&head1, 3); 
    push(&head1, 4); 
    push(&head1, 5); 
  
    /* create a linked list*/
    push(&head2, 1); 
    push(&head2, 3); 
    push(&head2, 5); 
    push(&head2, 6); 
    cout<<"First list is \n";
    print(head1);
    cout<<"\nSecond list is\n";
    print(head2);
    printunint(head1,head2);
	return 0;
}
