package linkedlist;

public class LinkedList {
    private Node head = null;  // head of the list

    // add value in list
    public void add(int value) {
        Node node = new Node(value, null);  // creating a new node
        // now connecting the new node with linkedlist
        if (head == null)
            // head is null for first element
            head = node;
        else {
            // means linkedlist has previous values
            Node ptr = head;    // creating copy of head to remember original head
            while (ptr.next != null) {  // because last element has next null
                ptr = ptr.next;
            }   // after traverse we will end up at last element
            ptr.next = node;    // saving new node address to previous last element
        }
    }
    // get value
    public int get(int index) {
        Node ptr = head;
        int count = 0; // starting point of list

        while (ptr != null) {   // traverse through list
            if (index == count) // check if we reached the desired index
                break;  // if we reached the desired index, break the while loop
            ptr = ptr.next;
            count++; // if we didn't reached the desired index, move current index + 1
        }

        try {   // handling exception in case of index > size of linkedlist
            return ptr.data;    // in case of index > size, ptr will be null, thus throwing NullPointerException
        }
        catch (NullPointerException nullPointerException) { // in case of NullPointerException
            System.out.println("Element not present at index " + index);    // print error message
            return -1;  // return default integer
        }
    }
    // traverse
    public void display() {
        Node ptr = head;
        while (ptr != null) {   // because if we do ptr.next last element will be excluded from while condition
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
    // size of linkedlist
    public int size(){
        Node ptr = head;
        int count=0;
        while (ptr != null){
            ptr = ptr.next;
            count++;
        }
        return count;
    }
    // delete
    public void delete(int index) {
        // condition 1: delete first element from linkedlist
        if (index == 0) {
            head = head.next;   // to delete the first element move head forwards
        }
        // condition 2: delete any element from linkedlist
        else {
            Node ptr = head;    // ptr represents current pointer starting from head
            Node prev = null;   // prev represents previous pointer of ptr
            int count = 0;
            while (ptr != null) {   // traverse through list
                if (count == index) {
                    // delete
                    prev.next = ptr.next;   // set address of ptr.next in prev.next so that ptr is skipped
                    break;
                }
                count++;    // increase the count
                prev = ptr; // move prev forward
                ptr = ptr.next; // prev will always represent previous of ptr, therefore move ptr forward
            }
        }
    }
    // reverse a linkedlist
    public void reverse() {
        Node back = null;   // represent previous pointer
        Node current = head;    // represent current pointer
        Node forward = null;    // represent forward pointer

        while (current != null) {   // traverse through all elements
            forward = current.next; // move forward ahead of current
            current.next = back;    // current will point to the previous element
            back = current; // move back element forward
            current = forward;  // move current element forward
        }
        // at the end current and forward will be null, and last element will be
        // represented by back, therefore acting as a head
        head = back;
    }
}

// node is the basic element in linkedlist that store value and address of next node
class Node {
    public int data;    // variable to hold data
    public Node next;   // object acting as a pointer to store next node

    public Node(int data, Node next) {  // constructor to create and store data in node
        this.data = data;
        this.next = next;
    }
}
