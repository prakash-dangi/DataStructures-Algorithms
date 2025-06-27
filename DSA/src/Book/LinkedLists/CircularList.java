package Book.LinkedLists;

public class CircularList<T extends Comparable<T>> extends LinkedList<T> {
    Node<T> header;

    public CircularList() {
        this.header = new Node<>(null, null);
        this.start = header;
    }

    public void add(T data) {
        if (this.header.nextNode == null) {
            this.header.nextNode = new Node<>(data, header);
        } else {
            this.header.nextNode = new Node<>(data, this.header.nextNode);
        }
    }

    public void printList() {
        Node<T> i = this.header.nextNode;
        do {
            if (i.nextNode == start) {
                System.out.print(i.data);
            } else System.out.print(i.data + " -> ");
            i = i.nextNode;
        } while (i != this.start);
     }
}
