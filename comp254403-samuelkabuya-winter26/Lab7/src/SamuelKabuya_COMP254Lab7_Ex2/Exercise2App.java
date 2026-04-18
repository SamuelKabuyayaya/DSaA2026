package SamuelKabuya_COMP254Lab7_Ex2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Exercise2App {
    public static void main(String[] args) {
        Queue<Integer> values = new ArrayDeque<>();
        int[] data = {34, 7, 23, 32, 5, 62, 10, 1};

        for (int value : data) {
            values.add(value);
        }

        System.out.println("Original queue: " + values);
        Queue<Integer> sorted = BottomUpMergeSort.sort(values);
        System.out.println("Sorted queue:   " + sorted);
    }
}
