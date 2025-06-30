package Book.LinkedLists;

public class CircularList<T extends Comparable<T>> extends LinkedList<T> {
    Node<T> header;

    public CircularList() {
        this.header = new Node<>(null, null);
        this.header.next = this.header;
    }

    public void addStart(T data) {
        Node<T> newNode = new Node<>(data, header.next);
        header.next = newNode;
    }

    public void addEnd(T data) {
        Node<T> newNode = new Node<>(data, header);
        Node<T> current = header;
        while (current.next != header) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        if (header.next == header) {
            System.out.println("List is empty");
            return;
        }
        Node<T> current = header.next;
        while (current.next != header) {
            System.out.print(current.data);
            current = current.next;
            if (current != header) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
     }
}
