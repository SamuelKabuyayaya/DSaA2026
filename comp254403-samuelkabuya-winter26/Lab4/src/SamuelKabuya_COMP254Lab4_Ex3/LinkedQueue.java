package SamuelKabuya_COMP254Lab4_Ex3;

public class LinkedQueue<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public void enqueue(E element) {
        list.addLast(element);
    }

    public E deque() {
        return list.removeFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void concat(LinkedQueue<E> Q2) {
        this.list.concat(Q2.list);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        LinkedQueue<Integer> q1 = new LinkedQueue<>();
        LinkedQueue<Integer> q2 = new LinkedQueue<>();

        q1.enqueue(1);
        q1.enqueue(2);
        q2.enqueue(3);
        q2.enqueue(4);

        System.out.println("Before Q1: " + q1 + " Q2: " + q2);

        q1.concat(q2);

        System.out.println("After Q1: " + q1 + " Q2: " + q2);


    }
}
