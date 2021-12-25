package practice.linkedlist;

public class Main {
    public static void main(String[] args) {
        Linkedlist linkedList = new Linkedlist();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
//        linkedList.delete(2);
        linkedList.reverse();
        linkedList.display();
//        System.out.println(linkedList.get(1));
//        System.out.println(linkedList.size());
    }
}
