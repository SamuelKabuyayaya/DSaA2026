package SamuelKabuya_COMP254Lab4_Ex1;

public class PositionalList<E> {

    private static class Node<E> implements Position<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() throws IllegalStateException {
            if (next == null) throw new IllegalStateException("Position invalid");
            return element;
        }
    }

    private Node<E> header;
    private Node<E> trailer;

    public PositionalList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.next = trailer;
    }

    public Position<E> first() {
        if (header.next == trailer) return null;
        return header.next;
    }

    public Position<E> last() {
        if (trailer.prev == header) return null;
        return trailer.prev;
    }

    public Position<E> after(Position<E> p) {
        Node<E> node = (Node<E>) p;
        if (node.next == trailer) return null;
        return node.next;
    }

    public Position<E> addLast(E e) {
        Node<E> newest = new Node<>(e, trailer.prev, trailer);
        trailer.prev.next = newest;
        trailer.prev = newest;
        return newest;
    }
}