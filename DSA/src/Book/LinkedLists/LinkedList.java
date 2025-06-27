package Book.LinkedLists;

public class LinkedList<T extends Comparable<T>> {
    Node<T> start;
    Node<T> currentNode;

    public LinkedList() {
        this.start = null;
        this.currentNode = null;
    }

    public void add(T data) {
        if (this.start == null) {
            this.start = new Node<>(data, null);
            this.currentNode = this.start;
        } else {
            this.start = new Node<>(data, this.start);
        }
    }

    public void add(T data, int node) {
        if (this.start == null) {
            this.start = new Node<>(data, null);
            this.currentNode = this.start;
        } else {
            int count = 0;
            Node<T> i = this.start;
            while (count < node) {
                count++;
                i = i.nextNode;
            }
            i.nextNode = new Node<>(data, i.nextNode);
        }
    }

    public void addEnd(T data) {
        if (this.start == null) {
            this.start = new Node<>(data, null);
            this.currentNode = this.start;
        } else {
            this.currentNode.nextNode = new Node<>(data, null);
            this.currentNode = this.currentNode.nextNode;
        }
    }

    public void addSorted(T data) {
        if (this.start == null) {
            add(data);
        } else if (data.compareTo(start.data) < 0) {
            add(data); // add new node with `data` at the start
        } else {
            Node<T> i = this.start;
            Node<T> prev = null;
            while (data.compareTo(i.data) > 0) {
                prev = i;
                if (i.nextNode == null) { // handles the edge case
                    break;
                }
                i = i.nextNode;
            }
            assert prev != null; // although `prev == null` will never become true, but this line is added just for safety
            prev.nextNode = new Node<>(data, prev.nextNode);
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
        Node<T> i = this.start;
        int count = -1;
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
        Node<T> i = this.start;
        int count = -1;
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