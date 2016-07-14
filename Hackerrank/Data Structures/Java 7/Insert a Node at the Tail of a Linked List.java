Node Insert(Node head,int data) {

    //we first create a new node whose next ref will point to null (since it will act as a last node)
    Node newest = new Node();
    newest.data = data;
    newest.next = null;

    //then we check if head is already null, if it is just replace it with our newest node and return it
    if(head == null) {
        head = newest;
        return head;
    }

    //if not, then first create a copy of head (because we want to return the original head)
    //and find when the next points to null, when that happens then just set it to be equal to our newest node and return original head
    else {
        Node c = head;
        while(c.next!=null) {
            c = c.next;
        }
        c.next = newest;
        return head;
    }
}

/*You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node. The given head pointer may be null, meaning that the initial list is empty.

Input Format
You have to complete the Node* Insert(Node* head, int data) method. It takes two arguments: the head of the linked list and the integer to insert. You should not read any input from the stdin/console.

Output Format
Insert the new node at the tail and just return the head of the updated linked list. Do not print anything to stdout/console.

Sample Input

NULL, data = 22
22 --> NULL, data = 33
Sample Output

2 -->NULL
2 --> 3 --> NULL
Explanation
1. We have an empty list, and we insert 22.
2. We start with a 22 in the tail. When 33 is inserted, 33 then becomes the tail.*/
