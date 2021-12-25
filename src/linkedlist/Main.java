package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);

//        linkedlist.delete(4);
        linkedlist.reverse();
        linkedlist.display();
    }
}
