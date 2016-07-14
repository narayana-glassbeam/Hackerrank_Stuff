Node MergeLists(Node headA, Node headB) {
    if(headA==null && headB==null) return null;
    if(headA==null) return headB;
    if(headB==null) return headA;
    Node c;
    if(headA.data<headB.data) {
        c = headA;
        c.next= MergeLists(headA.next, headB);
    }
    else {
        c=headB;
        c.next= MergeLists(headA, headB.next);
    }
    return c;
}


/*You’re given the pointer to the head nodes of two sorted linked lists. The data in both lists will be sorted in ascending order. Change the next pointers to obtain a single, merged linked list which also has data in ascending order. Either head pointer given may be null meaning that the corresponding list is empty.

Input Format
You have to complete the Node* MergeLists(Node* headA, Node* headB) method which takes two arguments - the heads of the two sorted linked lists to merge. You should NOT read any input from stdin/console.

Output Format
Change the next pointer of individual nodes so that nodes from both lists are merged into a single list. Then return the head of this merged list. Do NOT print anything to stdout/console.

Sample Input

1 -> 3 -> 5 -> 6 -> NULL
2 -> 4 -> 7 -> NULL

15 -> NULL
12 -> NULL

NULL
1 -> 2 -> NULL
Sample Output

1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
12 -> 15 -> NULL
1 -> 2 -> NULL*/
