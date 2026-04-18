package SamuelKabuya_COMP254Lab7_Ex2;

import java.util.ArrayDeque;
import java.util.Queue;

public class BottomUpMergeSort {

    public static Queue<Integer> sort(Queue<Integer> input) {
        Queue<Queue<Integer>> queueOfQueues = new ArrayDeque<>();

        while (!input.isEmpty()) {
            Queue<Integer> single = new ArrayDeque<>();
            single.add(input.remove());
            queueOfQueues.add(single);
        }

        if (queueOfQueues.isEmpty()) {
            return new ArrayDeque<>();
        }

        while (queueOfQueues.size() > 1) {
            Queue<Integer> q1 = queueOfQueues.remove();
            Queue<Integer> q2 = queueOfQueues.remove();
            queueOfQueues.add(merge(q1, q2));
        }

        return queueOfQueues.remove();
    }

    private static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> result = new ArrayDeque<>();

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
