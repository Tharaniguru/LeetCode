/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode *temp=head;
    struct ListNode *prev=head;
    int count =0;
    while(temp!=NULL){
        count++;
        temp=temp->next;
    }
    temp=head;
    int now=0;
    while(now<count-n){
        now++;
        prev=temp;
        temp=temp->next;
    }
    if(temp!=NULL)
    {printf("%d",temp->val);}
    
    if(count-n+1==1){
        head=head->next;
    }
    else if(count==n){
        head=NULL;
    }
    else{
        prev->next=temp->next;
    }
    return head;

}