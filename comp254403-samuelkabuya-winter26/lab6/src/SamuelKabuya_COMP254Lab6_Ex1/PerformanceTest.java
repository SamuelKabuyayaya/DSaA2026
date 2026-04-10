package SamuelKabuya_COMP254Lab6_Ex1;

import java.util.Random;

public class PerformanceTest {
    public static void main(String[] args) {
        int n = 100000; // element amount
        double[] factors = {0.2, 0.5, 0.75, 0.9}; // different limits

        System.out.println("ChainHashMap: ");
        for (double factor : factors) {
            ChainHashMap<Integer, Integer> map = new ChainHashMap<>(17, factor);
            Random rnd = new Random();

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                map.put(rnd.nextInt(1000000), i);
            }
            long endTime = System.currentTimeMillis();

            System.out.println("Max Load Factor: " + factor + "  Time: " + (endTime - startTime) + " ms");
        }
    }
}