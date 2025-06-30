package Book.LinkedLists;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addStart(1);
        list.addStart(2);
        list.addStart(3);
        list.deleteItem(3);
        list.printList();


//        LinkedList<Integer> list = new LinkedList<>();
//        list.addStart(1); // inserting at the head
//        list.printList();
//        list.addEnd(2); // inserting at end
//        list.addEnd(3);
//        list.addEnd(5);
//        list.printList();
//        list.addStart(0); // inserting at head
//        list.printList();
//        list.addStart(4, 3); // inserting at the 4th node
//        list.printList();
//        list.addEnd(9);
//        list.addEnd(10);
//        list.addStart(6, 5);
//        list.addStart(7, 6);
//        list.addStart(8, 7);
//        list.printList();
//        list.searchSorted(5);
//        int data = list.deleteAt(5);
//        System.out.println(data + " deleted");
//        list.printList();
//        list.deleteItem(10);
//        list.printList();
//        list.deleteItem(6);
//        list.printList();

//        list.addSorted(1);
//        list.printList();
//        list.addSorted(2);
//        list.addSorted(3);
//        list.addSorted(4);
//        list.addSorted(6);
//        list.printList();
//        list.addSorted(7);
//        list.addSorted(8);
//        list.addSorted(5);
//        list.printList();
//        list.addSorted(5);
//        list.printList();
//        list.addSorted(9);
//        list.printList();
    }
}
