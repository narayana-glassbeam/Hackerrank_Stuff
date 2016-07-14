void Print(Node head) {
  while(head != null) {
      System.out.println(head.data);
      head = head.next;
  }
}

/*If you are new to working with linked lists, then this is a great exercise to get familiar with them. You are given the pointer to the head node of a linked list. You need to print all its elements in order, one element per line. The head pointer may be null, i.e. it may be an empty list. In that case, don’t print anything!

Input Format
You have to complete the void Print(Node* head) method which takes one argument: the head of the linked list. You should not read any input from stdin/console. The struct Node has a data part which stores the data and a next pointer which points to the next element of the linked list. There are multiple test cases. For each test case, this method will be called individually.

Output Format
Print the elements of the linked list to stdout/console (using printf or cout). Print one per line.*/
