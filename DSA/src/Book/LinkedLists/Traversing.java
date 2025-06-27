package Book.LinkedLists;

public class Traversing {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(2);
        list.add(12);
        list.add(1);
        list.add(35);
        list.add(22);
        list.add(17);
        list.add(87);
        list.add(3);
        list.printList();
        list.search(35);
    }
}
