package Book.LinkedLists;

class Node<T> {
    T data;
    Node<T> nextNode;

    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }
}
