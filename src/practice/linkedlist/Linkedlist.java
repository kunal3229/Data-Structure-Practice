package practice.linkedlist;
public class Linkedlist {
    private Node head;
    // ADD
    public void add(int value){
        if (head == null){
            Node node = new Node(value,null);
            head = node;
        }
        else {
            Node ptr = head;
            while (ptr.next != null){
                ptr = ptr.next;
            }
            Node node = new Node(value,null);
            ptr.next = node;
        }

    }
    //Display
    public void display(){
        Node ptr = head;
        while (ptr != null){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }
    //Get
    public int get(int index){
        Node ptr = head;
        int count =0;
        while (ptr != null){
            if (index == count){
                break;
            }
            ptr = ptr.next;
            count++;
        }
        return ptr.data;
    }
    //Size
    public int size(){
        Node ptr = head;
        int count=0;
        while (ptr != null){
            ptr = ptr.next;
            count++;
        }
        return count;
    }
    // Delete
    public void delete(int index) {
        if(index ==0){
            head = head.next;
        }
        else {
            Node ptr = head;
            Node prev = null;
            int count =0;
            while (ptr != null){
                if (index == count){
                    prev.next = ptr.next;
                    break;
                }
                prev = ptr;
                ptr = ptr.next;
                count++;
            }
        }
    }
    // Reverse
    public void reverse(){
        Node previous = null;
        Node current = head;
        Node forward = null;
        while (current != null){
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        head = previous;

    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}