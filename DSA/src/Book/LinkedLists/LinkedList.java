package Book.LinkedLists;

import java.util.NoSuchElementException;

public class LinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        this.head = null;
    }

    public void addStart(T data) { // Add items at the head of the list
        head = new Node<>(data, head);
    }

    public void addAt(T data, int index) {
        if (index < 0) throw new IndexOutOfBoundsException("Negative index");
        if (index == 0) {
            addStart(data);
            return;
        }
        Node<T> current = this.head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) throw new IndexOutOfBoundsException("Index too large");
            current = current.next;
        }
        current.next = new Node<>(data, current.next);
    }

    public void addEnd(T data) {
        if (this.isEmpty()) {
            head = new Node<>(data, null);
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node<>(data, null);
    }

    public void addSorted(T data) {
        if (isEmpty() || data.compareTo(head.data) < 0) {
            addStart(data);
            return;
        }
        Node<T> prev = null, current = head;
        while (current != null && data.compareTo(current.data) > 0) {
            prev = current;
            current = current.next;
        }
        assert prev != null;
        prev.next = new Node<>(data, current);
    }

    public T deleteAt(int index) {
        if (isEmpty()) throw new IndexOutOfBoundsException("Empty list");
        if (index < 0) throw new IndexOutOfBoundsException("Negative index");
        if (index == 0) {
            T data = head.data;
            head = head.next;
            return data;
        }

        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) throw new IndexOutOfBoundsException("Index too large");
            current = current.next;
        }

        if (current.next == null) throw new IndexOutOfBoundsException("Index too large");

        T data = current.next.data;
        current.next = current.next.next;
        return data;
    }

    public boolean deleteItem(T item) {
        if (isEmpty()) throw new NoSuchElementException("Empty list");

        if (item.equals(head.data)) {
            head = head.next;
            return true;
        }

        Node<T> prev = null, current = head;
        while (current != null && !item.equals(current.data)) {
            prev = current;
            current = current.next;
        }

        if (current == null) return false;

        assert prev != null;
        prev.next = current.next;
        return true;
    }

    public T getFirst() {
        if (isEmpty()) throw new NoSuchElementException("Empty list");
        return head.data;
    }

    public int search(T item) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (item.equals(current.data)) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public int searchSorted(T item) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            int cmp = item.compareTo(current.data);
            if (cmp == 0) return index;
            if (cmp < 0) return -1;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
            if (current != null) System.out.print(" -> ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}