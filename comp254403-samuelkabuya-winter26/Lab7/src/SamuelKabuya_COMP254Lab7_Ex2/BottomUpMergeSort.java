package SamuelKabuya_COMP254Lab7_Ex2;

import java.util.ArrayDeque;
import java.util.Queue;

public class BottomUpMergeSort {

    public static <T extends Comparable<T>> Queue<T> sort(Queue<T> input) {
        Queue<Queue<T>> queueOfQueues = new ArrayDeque<>();

        // Put each element into its own queue
        while (!input.isEmpty()) {
            Queue<T> single = new ArrayDeque<>();
            single.add(input.remove());
            queueOfQueues.add(single);
        }

        if (queueOfQueues.isEmpty()) {
            return new ArrayDeque<>();
        }

        // Repeatedly merge pairs of queues
        while (queueOfQueues.size() > 1) {
            Queue<T> q1 = queueOfQueues.remove();
            Queue<T> q2 = queueOfQueues.remove();
            queueOfQueues.add(merge(q1, q2));
        }

        return queueOfQueues.remove();
    }

    private static <T extends Comparable<T>> Queue<T> merge(Queue<T> q1, Queue<T> q2) {
        Queue<T> result = new ArrayDeque<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek().compareTo(q2.peek()) <= 0) {
                result.add(q1.remove());
            } else {
                result.add(q2.remove());
            }
        }

        while (!q1.isEmpty()) {
            result.add(q1.remove());
        }

        while (!q2.isEmpty()) {
            result.add(q2.remove());
        }

        return result;
    }
}
