package Book.LinkedLists;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); // inserting at the start
        list.printList();
        list.addEnd(2); // inserting at end
        list.addEnd(3);
        list.addEnd(5);
        list.printList();
        list.add(0); // inserting at start
        list.printList();
        list.add(4, 3); // inserting at the 4th node
        list.printList();
        list.addEnd(9);
        list.addEnd(10);
        list.printList();
        list.searchSorted(5);

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
