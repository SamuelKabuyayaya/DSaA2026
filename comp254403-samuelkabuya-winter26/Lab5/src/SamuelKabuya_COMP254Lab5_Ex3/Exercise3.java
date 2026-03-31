package SamuelKabuya_COMP254Lab5_Ex3;

import java.util.ArrayList;

public class Exercise3 {

    static class HeapPriorityQueue {
        ArrayList<Integer> heap = new ArrayList<>();

        protected void upheap(int j) {
            if (j > 0) {
                int p = (j - 1) / 2;
                if (heap.get(j) < heap.get(p)) {
                    int temp = heap.get(j);
                    heap.set(j, heap.get(p));
                    heap.set(p, temp);

                    upheap(p);
                }
            }
        }

        public void insert(int key) {
            heap.add(key);
            upheap(heap.size() - 1);
        }

        public void printHeap() {
            System.out.println("Heap structure: " + heap);
        }
    }

    public static void main(String[] args) {
        HeapPriorityQueue pq = new HeapPriorityQueue();

        pq.insert(10);
        pq.insert(5);
        pq.insert(15);
        pq.insert(2);

        pq.printHeap();
    }
}