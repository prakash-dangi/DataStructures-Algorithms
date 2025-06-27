package Book.LinkedLists;

public class LinkedList<T extends Comparable<T>> {
    Node<T> start;
    Node<T> currentNode;

    public LinkedList() {
        this.start = null;
        this.currentNode = null;
    }

    public void add(T data) {
        if (start == null) {
            this.start = new Node<T>(data, null);
            this.currentNode = start;
        } else {
            this.currentNode.nextNode = new Node<T>(data, null);
            this.currentNode = this.currentNode.nextNode;
        }
    }

    public void printList() {
        Node<T> i = this.start;
        while (i != null) {
            if (i.nextNode == null) {
                System.out.println(i.data);
                i = i.nextNode;
            } else {
                System.out.print(i.data + " -> ");
                i = i.nextNode;
            }
        }
    }

    public boolean search(T item) {
        Node<T> i = start;
        int count = 0;
        while (i != null) {
            count++;
            if (item.compareTo(i.data) == 0) {
                System.out.println(i.data + " present at node " + count);
                return true;
            }
            i = i.nextNode;
        }
        return false;
    }

    public boolean searchSorted(T item) {
        Node<T> i = start;
        int count = 0;
        while (i != null) {
            count++;
            if (item.compareTo(i.data) > 0) {
                i = i.nextNode;
            } else if (item.compareTo(i.data) == 0) {
                System.out.println(i.data + " present at node " + count);
                return true;
            } else {
                System.out.println("Item not found.");
            }
        }
        return false;
    }
}