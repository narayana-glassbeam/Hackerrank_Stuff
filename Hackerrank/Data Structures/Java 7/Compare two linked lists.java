int CompareLists(Node headA, Node headB) {
    while(headA!=null) {
        if (headA.data!=headB.data || headB==null) return 0;
        headA = headA.next;
        headB = headB.next;
    }
    return headB!=null ? 0 : 1;
}
